package day9_collection;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //add
        //1.append
        list.add("hello");
        list.add("hi");
        list.add("joke");
        //2.insert-> add(index,value);
        list.add(3,"黄");

        //remove
        //1.remove an object directly, return if you remove successfully
        boolean f = list.remove("hola");
        System.out.println(f);
        //2.remove by index
        String e = list.remove(1);
        System.out.println("you just removed "+e);

//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        for(int i=0 ; i < list.size() ; i++){
//            System.out.println(list.get(i));
//        }

        for(String x:list){
            System.out.println(x);
        }
    }
}
