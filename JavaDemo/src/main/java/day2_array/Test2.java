package day2_array;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int[] scores = new int[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter the score of student 1:");
        scores[0] = scanner.nextInt();

        System.out.println("please enter the score of student 2:");
        scores[1] = scanner.nextInt();
        //.............

        System.out.println("please checks the scores:");
        //output the result 1 by 1

        //output the sum score,average score,how many people passed the exam(>=60)
    }
}
