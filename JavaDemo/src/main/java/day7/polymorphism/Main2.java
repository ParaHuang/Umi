package day7.polymorphism;

public class Main2 {
    public static void main(String[] args) {
        //polymorphism: 1 thing shows in different way
        //2 precondition:
        //a. reference type change
        //b. override

        //2 ways to create object
        //1. initialize
        //Type name = new Type();
        Chinese c = new Chinese();
        c.eat();
        c.sleep();
        c.kungFu();
        System.out.println();

        //2. reference type change
        //SuperClass name = new SubClass();
        Human h = new Chinese();
        h.eat();
        h.sleep();
//        h.kungFu();   //can't call
        //the reference type decides when methods we can call
        //the object type decides how you call it

    }
}
