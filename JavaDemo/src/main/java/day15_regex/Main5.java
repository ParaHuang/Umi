package day15_regex;

import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) {
//        String regex = "(?i)(hello)";
//        System.out.println("HELLO".matches(regex));


//        String regex = "[\\u4e00-\\u9fa5]";
//        System.out.println("哈".matches(regex));

        String ip = "192.68.42.111";
        String[] arr = ip.split("[.]");
        System.out.println(Arrays.toString(arr));

        System.out.println("hello".replaceAll("[lo]","哦"));
    }
}
