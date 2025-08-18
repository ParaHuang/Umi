package day6_inheritance;

public class Animal {
    public void breath(){
        System.out.println("animal breath");
    }
}

class Fish extends Animal{
    public void swim(){
        System.out.println("fish swim");
    }
}

class Shark extends Fish{
    public void hunt(){
        System.out.println("shark hunt");
    }
}

class BullShark extends Shark{
    public void deepDive(int meter){
        System.out.println("bull shark deep dive for "+meter+"m");
    }
}
