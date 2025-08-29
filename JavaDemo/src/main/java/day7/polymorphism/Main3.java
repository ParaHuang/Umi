package day7.polymorphism;

public class Main3 {
    public static void main(String[] args) {
        PS5 p = new PS5();
        Nintendo n = new Nintendo();
        XBox x = new XBox();

        DigitalCamera d = new DigitalCamera();
        Polaroid p1 = new Polaroid();
        GoPro g = new GoPro();

        Cellphone c = new Cellphone();
        //Cellphone c1 = new Cellphone();

        YoungPeople youngPeople = new YoungPeople();
        youngPeople.haveFun(p);
        youngPeople.haveFun(n);
        youngPeople.haveFun(x);

        youngPeople.goodMoments(d);
        youngPeople.goodMoments(p1);
        youngPeople.goodMoments(g);

        youngPeople.goodMoments(c);//haveFun(c);
        //youngPeople.goodMoments(c1);
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
//1.if there are abstract methods in a class, then it's also an abstract class  (inside abstract class,there are abstract methods+normal methods)
//2.if there are only abstract methods in an abstract class, then we can make it as an interface  (inside interface, there are only abstract methods)
//3.all methods are abstract inside interface, so we don't need modifier
//4.we can implements more than 1 interface
interface GameMachine{
    void playGame();
}

class PS5 implements GameMachine{
    @Override
    public void playGame() {
        System.out.println("buy a game CD，connect with TV，there we go!");
    }
}

class Nintendo implements GameMachine{
    @Override
    public void playGame() {
        System.out.println("turn it on，choose a game，playing alone，so nice");
    }
}

class XBox implements GameMachine{
    @Override
    public void playGame() {
        System.out.println("connect with TV,choose a game from game store, then play");
    }
}

// B
interface Camera{
    void takePicture();
}

class Polaroid implements Camera{
    @Override
    public void takePicture() {
        System.out.println("press the shutter, get an instant photo");
    }
}

class GoPro implements Camera{
    @Override
    public void takePicture() {
        System.out.println("diving into ocean,let's memorize this beautiful world");
    }
}

class DigitalCamera implements Camera{
    @Override
    public void takePicture() {
        System.out.println("press the shutter,get an digital picture");
    }
}

//alt+enter -> show solutions
class Cellphone implements Camera, GameMachine{

    @Override
    public void takePicture() {
        System.out.println("take my phone out, take a picture that I can watch it everyday");
    }

    @Override
    public void playGame() {
        System.out.println("take my phone out, login, play some online games with my teammates");
    }
}

//single extends
class A{}
class B{}
class C extends A{}
//multiple implements
interface D{}
interface E{}
class F implements D,E{}
class G extends A implements D,E{}