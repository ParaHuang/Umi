package day3_methods;

import day4_oop.Student;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.print5Hello();

        System.out.println();
        printHello(3);   //3
        System.out.println();
        printHello(7);   //7

        int x = giveNumberFrom1To100();
        System.out.println(x);

        int y = sum(11,22);
        System.out.println(y);
//        Random random = new Random();
//        int x = random.nextInt();

        Student s =  new Student();
    }

    //member method
    //no parameter,no return
    public void print5Hello(){
        for(int i=1 ; i<=5 ; i++){
            System.out.println("hello");
        }
    }
    public void randomMethod(){
        print5Hello();
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
