package day15_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main6 {
    public static void main(String[] args) {
        //use the regex methods from String
        //  str.matches(regex)  ->  boolean
        //  str.split(regex)    ->  String[]
        //  str.replaceAll(regex,newContent)    ->  String

        //regex
        //1.define a rule
        Pattern pattern = Pattern.compile("\\d+");
        //2.generate a mather
        Matcher matcher = pattern.matcher("192.68.42.111");
        //3.check if content fully matches
//        System.out.println(matcher.matches());
        //4. find() and group()
        while(matcher.find()){
            System.out.println(matcher.group());
        }


        /*
        System.out.println(matcher.find());     //if the string has content matches the rule
        System.out.println(matcher.group());

        System.out.println(matcher.find());
        System.out.println(matcher.group());

        System.out.println(matcher.find());
        System.out.println(matcher.group());

        System.out.println(matcher.find());
        System.out.println(matcher.group());
        */
//        System.out.println(matcher.find());
//        System.out.println(matcher.group());
    }
}
