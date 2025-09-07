package day9_exception;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        //Exception: mistake happens when the program is running
        //RuntimeException:use logic to avoid that
        //Compile Exception:exception that's easy to happen, so force you to deal with it

        //to deal with exception:
        //1.try...catch...finally
        //2.add a signature to the method, to tell the rest program to deal with it if it's called
        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b);
        }catch(ArithmeticException e){
            //solution
            e.printStackTrace();    //suggest print information
            System.out.println("can't be divided by 0");
        }

        //compile exception
        try {
            Class.forName("java.util.Scanner");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Class.forName("java.util.Random");


        System.out.println("the end of program");
    }
}
