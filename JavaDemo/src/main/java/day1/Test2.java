package day1;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
//        Random random = new Random();
//        System.out.println(random.nextInt());       //generate a big random number
//        System.out.println(random.nextInt(4));  //generate a big random number in the range of 0 ~ bound-1
//        System.out.println(random.nextInt(1,4)); //generate a big random number in the range of origin ~ bound-1
//        System.out.println(Math.random());
        //1.user choose
        System.out.println("please choose: 1-rock,2-paper,3-scissor：");
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();
        if(user==1){
            System.out.println("you just choose rock");
        }else if(user==2){
            System.out.println("you just choose paper");
        }else{
            System.out.println("you just choose scissor");
        }

        //2.computer choose
        Random random = new Random();
        int computer = random.nextInt(1,4);
        System.out.println(computer);
        //display what computer choose

        //display the result
    }
}
