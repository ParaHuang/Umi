package day7.polymorphism;

public class Main3 {
    public static void main(String[] args) {
        PS5 p = new PS5();
        Nintendo n = new Nintendo();
        XBox x = new XBox();

        DigitalCamera d = new DigitalCamera();
        Polaroid p1 = new Polaroid();
        GoPro g = new GoPro();


        YoungPeople youngPeople = new YoungPeople();
        youngPeople.haveFun(p);
        youngPeople.haveFun(n);
        youngPeople.haveFun(x);

        youngPeople.goodMoments(d);
        youngPeople.goodMoments(p1);
        youngPeople.goodMoments(g);
    }
}

class YoungPeople{
//  1.have fun，if we want to have fun,we need game machine, we use game machine to play games
    public void haveFun(GameMachine gameMachine){
        System.out.println("young people is having fun");
        gameMachine.playGame();
    }

//  2.record good moments，if we want to record, we need camera, we use camera to take pictures.
    public void goodMoments(Camera camera){
        System.out.println("young people is having fun");
        camera.takePicture();
    }

}

abstract class GameMachine{
    public abstract void playGame();
}

class PS5 extends GameMachine{
    @Override
    public void playGame() {
        System.out.println("buy a game CD，connect with TV，there we go!");
    }
}

class Nintendo extends GameMachine{
    @Override
    public void playGame() {
        System.out.println("turn it on，choose a game，playing alone，so nice");
    }
}

class XBox extends GameMachine{
    @Override
    public void playGame() {
        System.out.println("connect with TV,choose a game from game store, then play");
    }
}

// B
abstract class Camera{
    public abstract void takePicture();
}

class Polaroid extends Camera{
    @Override
    public void takePicture() {
        System.out.println("press the shutter, get an instant photo");
    }
}

class GoPro extends Camera{
    @Override
    public void takePicture() {
        System.out.println("diving into ocean,let's memorize this beautiful world");
    }
}

class DigitalCamera extends Camera{
    @Override
    public void takePicture() {
        System.out.println("press the shutter,get an digital picture");
    }
}
