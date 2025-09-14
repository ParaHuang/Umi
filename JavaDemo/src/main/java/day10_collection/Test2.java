package day10_collection;

import java.util.HashSet;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        //no duplicate value,no index
        Set<String> set = new HashSet<>();      //no order
        set.add("hello");
        set.add("hey");
        set.add("hi");
        set.add("hi");
        set.add("hola");
        set.add("hola");
        set.add("hallo");


        System.out.println(set);
        for(String x:set){
            System.out.println(x);
        }
        System.out.println("size:"+set.size());
        System.out.println("contains hold:"+set.contains("hola"));



    }
}
