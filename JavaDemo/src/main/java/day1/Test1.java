package day1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int x = 10;
        double y = 3.14;
        String z = "hello";

        //define a variable, name is sc, type is Scanner
        Scanner sc = new Scanner(System.in);    //create a Scanner, which scans the keyboard
        int num = sc.nextInt();   //get the program stuck at here to wait for user input a integer number
        //5

        //->1*2*3*4*5
        int result = 1;
        for(int i=1 ; i<=num ; i++){
            result *= i;
        }


        System.out.println("the end of program,the factorial of "+num+" is "+result);
    }
}
