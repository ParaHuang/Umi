package day15_regex;

public class Main1 {
    public static void main(String[] args) {
        String email = "paradox41163.com";

        //1. needs include @ and .
        //2. can only include 1 single @ and .
        //3. @ and . can't be in the beginning or in the end
        //4. @ has to be in front of . but not next to it

        int atIndex = email.indexOf("@");
        System.out.println(atIndex);
        if(atIndex == -1){
            System.out.println("invalid");
            return;
        }
        //the rest code
    }
}
