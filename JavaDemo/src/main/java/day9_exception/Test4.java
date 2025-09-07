package day9_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = a / b;
            System.out.println("the result is:" + c);
        }catch (Exception e){
            System.out.println("shit happens");
        }finally {
            System.out.println("no matter what, it's gonna happen");
        }


//        catch (InputMismatchException ime){
//            System.out.println("you should input an integer number");
//        }catch (ArithmeticException ae){
//            System.out.println("can't be / by zero");
//        }

        System.out.println("----------the end---------");
    }
}
