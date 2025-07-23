package day3_methods;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        print5Hello();
        System.out.println();
        printHello(3);   //3
        System.out.println();
        printHello(7);   //7
        //----------------------------------test
        int x = giveNumberFrom1To100();
        System.out.println(x);

        int y = sum(11,22);
        System.out.println(y);
//        Random random = new Random();
//        int x = random.nextInt();
    }

    //no parameter,no return
    public static void print5Hello(){
        for(int i=1 ; i<=5 ; i++){
            System.out.println("hello");
        }
    }

    //with parameter, no return
    public static void printHello(int times){
        for(int i=1 ; i<=times ; i++){
            System.out.println("hello");
        }
    }
    //no parameter, with return
    public static int giveNumberFrom1To100(){
        //code block
        Random random = new Random();
        return random.nextInt(1,101);
    }

    //with parameter, with return
    public static int sum(int a,int b){
        return a+b;
    }

}
