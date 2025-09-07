package day9_exception;

public class Test1 {
    public static void main(String[] args) {
        Human h1 = new Human(1001,"Jack",18,"male");
        System.out.println(h1);
        System.out.println(h1.id());
        System.out.println(h1.name());
        System.out.println(h1.age());
        System.out.println(h1.gender());
        h1.x();
    }
}
