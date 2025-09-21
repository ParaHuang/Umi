package playground.mapidimap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Where are you from?");
        System.out.println("China, UK, Australia and America?");

        String choice = input.nextLine();

        //choice = input.nextLine();

        switch (choice) {
            case "China":
                System.out.println("Bejing, Shanghai, Guangzhou, Shenzen");
                break;
            case "UK":
                System.out.println("London, Liverpool, Manchester, Birmingham");
                break;
            case "Australia":
                System.out.println("Sydney, Melbourne, Canberra, Bisbane");
                break;
            case "America":
                System.out.println("jkldikljfjalkd");


                break;
            default:
                System.out.println("Sorry, not available");

        }
    }
}
