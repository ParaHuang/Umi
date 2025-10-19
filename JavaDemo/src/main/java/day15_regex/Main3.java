package day15_regex;

public class Main3 {
    public static void main(String[] args) {
        String email = "paradox41@163.com";
        //1. needs include @ and .
        //2. can only include 1 single @ and .
        //3. @ and . can't be in the beginning or in the end
        //4. @ has to be in front of . but not next to it
        String regex = "\\w+@\\w+[.]\\w{2,4}";
        System.out.println(email.matches(regex));
        /*
        //meta character:matches 1 single character
        \d          digit number,0~9                \D          not number
        \w          0-9,letter,_                    \W          the opposite of \w
        \s          space character                 \S          not space
        .           every character except \n
        [aqw]       1 single character in a,q,w
        [n-x]       1 single character n to x
        [n-x0-5H-Z]       1 single character n to x, or 0 to 5, or H to Z

        //quantifier
        *           any times
        +           at least once
        ?           at most once
        {n}         n times
        {n,}        at least n times
        {n,m}       n to m times
         */


    }
}
