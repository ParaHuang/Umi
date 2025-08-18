package day6_inheritance;

public class Main {
    public static void main(String[] args) {
        Human h =  new Human();
        h.eat();
        h.sleep();
//        h.kungFu();
        System.out.println();

        Chinese c = new Chinese();
        c.eat();
        c.sleep();
        c.kungFu();
        System.out.println();

        Japanese j = new Japanese();
        j.eat();
        j.sleep();
        System.out.println();
    }
}
