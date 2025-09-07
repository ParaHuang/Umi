package day9_exception;

public class Test3 {
    public static void main(String[] args) {
        try {
            test1();
        } catch (ClassNotFoundException e) {
            System.out.println("class doesn't exist");
        }
    }

    //tell the world this method has problem
    public static void test1() throws ClassNotFoundException {
        Class.forName("java.util.Scanner");
    }
}
