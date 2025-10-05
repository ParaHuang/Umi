package day12_thread;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JFrame {
    public static void main(String[] args) {
        Game game = new Game();
        game.setVisible(true);
    }

    private JButton dino,bush;

    public Game() {
        setSize(800, 600);
        setTitle("Dinosaur");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(this);

        JPanel contentPane = new JPanel();      //flow layout
        setContentPane(contentPane);

        //no/absolute layout
        contentPane.setLayout(null);

        //create other components
        dino = new JButton("dinosaur");
        dino.setBounds(40, 400, 80, 80);
        contentPane.add(dino);

        bush = new JButton("bush");
        bush.setBounds(700, 400, 80, 80);
        contentPane.add(bush);

        

        Thread t1 = new Thread() {
            public void run() {
                while (true && !isColliding()) {
                    int x = bush.getX();
                    x -= 10;
                    if (x < -bush.getWidth()) {
                        x = 800;
                    }
                    bush.setLocation(x, bush.getY());
                    if(isColliding()){
                        System.out.println("colliding");
                    }
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        t1.start();

        dino.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 32 && dino.getY() == 400) {
                    Thread dinoThread = new Thread() {
                        @Override
                        public void run() {
                            //go up

                            try {
                                for (int i = 0; i < 10 && !isColliding(); i++) {
                                    int y = dino.getY();
                                    y -= 20;
                                    dino.setLocation(dino.getX(), y);
                                    Thread.sleep(70);
                                }

                                //go down
                                for (int i = 0; i < 10 && !isColliding(); i++) {
                                    int y = dino.getY();
                                    y += 20;
                                    dino.setLocation(dino.getX(), y);
                                    Thread.sleep(70);
                                }
                            } catch (InterruptedException ex) {
                                throw new RuntimeException(ex);
                            }

                        }
                    };
                    dinoThread.start();
                }
            }
        });

    }

    public boolean isColliding(){
        int bx = bush.getX();
        int bw = bush.getWidth();
        int by = bush.getY();

        int dx = dino.getX();
        int dw = dino.getWidth();
        int dy = dino.getY();
        int dh = dino.getHeight();

        if(bx<=dx+dw && bx+bw>=dx && by<=dy+dh){
            return true;
        }
        return false;
    }
}
