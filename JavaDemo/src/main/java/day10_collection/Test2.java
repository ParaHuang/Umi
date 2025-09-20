package day10_collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {
        //no duplicate value,no index
//        Set<String> set = new HashSet<>();      //no order
//        Set<String> set = new TreeSet<>();          //nature order
        Set<String> set = new LinkedHashSet<>();    //adding order
        set.add("hello");
        set.add("hey");
        set.add("hi");
        set.add("hi");
        set.add("hola");
        set.add("alex");
        set.add("hallo");


        System.out.println(set);
//        for(String x:set){
//            System.out.println(x);
//        }
//        System.out.println("size:"+set.size());
//        System.out.println("contains hold:"+set.contains("hola"));



    }
}
