package day12_thread;

import javax.swing.*;

public class Game extends JFrame{
    public static void main(String[] args) {
        Game game = new Game();
        game.setVisible(true);
    }

    public Game(){
        setSize(800,600);
        setTitle("Dinosaur");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(this);

        JPanel contentPane = new JPanel();      //flow layout
        setContentPane(contentPane);

        //no/absolute layout
        contentPane.setLayout(null);

        //create other components
        JButton btn = new JButton("dinosaur");
        btn.setBounds(40,400,80,80);
        contentPane.add(btn);

        JButton bush = new JButton("bush");
        bush.setBounds(700,400,80,80);
        contentPane.add(bush);

       
    }
}
