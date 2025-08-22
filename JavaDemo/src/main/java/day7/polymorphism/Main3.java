package day7.polymorphism;

public class Main3 {
    public static void main(String[] args) {
        PS5 p = new PS5();
        Nintendo n = new Nintendo();
        XBox x = new XBox();

        YoungPeople youngPeople = new YoungPeople();
        youngPeople.haveFun(p);
        youngPeople.haveFun(n);
        youngPeople.haveFun(x);
    }
}

class YoungPeople{
//  1.have fun，if we want to have fun,we need game machine, we use game machine to play games
    public void haveFun(GameMachine gameMachine){
        System.out.println("young people is having fun");
        gameMachine.playGame();
    }

//  2.record good moments，if we want to record, we need camera, we use camera to take pictures.


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
