package day9_collection;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        /*
        Collection                                      Map
        |
        |-------List--ArrayList
        |-------Set--HashSet,LinkedHashSet,TreeSet
         */


        //generic:data restriction
        List list = new ArrayList();    //save any value
        //1.add element
        list.add(12);
        list.add("hello");
        list.add(false);
        list.add(3.14);
        list.add('@');
        //2.get element
        Object v1 = list.get(0);
        System.out.println(v1);
//        System.out.println(list.size());
    }
}
