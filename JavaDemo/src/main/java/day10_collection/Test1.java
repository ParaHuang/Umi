package day10_collection;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //1.add
        list.add(89);
        list.add(11);
        list.add(10);
        list.add(22);
        list.add(55);
        list.add(55);
        list.add(22);

        System.out.println(list);
        //2.remove
//        int e = list.remove(1);
//        System.out.println("you removed:"+e);

        list.remove((Integer)11);
        System.out.println(list);

        //indexOf: the first appearance of an element, return -1 if the element doesn't exist
        int index = list.indexOf(22);
        System.out.println(index);
        //lastIndexOf
        int lastIndex = list.lastIndexOf(22);
        System.out.println(lastIndex);
        //contains
        boolean exist = list.contains(22);
        System.out.println(exist);
        list.clear();
        System.out.println(list);

        System.out.println(list.get(0));


        int x = 10;
//        Integer y = new Integer(10);//boxing
        Integer y = 10;         //auto boxing
//        int z = y.intValue();//unboxing
        int z = y;              //auto unboxing
        //Type t = new Type(value);

        int a = Integer.parseInt("89");

    }
}
