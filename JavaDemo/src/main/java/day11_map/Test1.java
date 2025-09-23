package day11_map;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {

        /*
        //name-Jack    age-18      gender-male
        List person = new ArrayList();
        person.add("Jack");
        person.add(18);
        person.add("male");
        //list should save information in the same type

        System.out.println("Name:"+person.get(0));
        */

//        Map(key-value)
//        Map<String, Object> person = new HashMap<>();
//        Map<String, Object> person = new TreeMap<>();       //nature order
        Map<String, Object> person = new LinkedHashMap<>();     //adding order

        //1. put value
        person.put("age",18);
        person.put("gender","male");
        person.put("name","Jack");
        person.put("name","Tom");       //save name-Tom

        System.out.println(person);

        //2.get value by key
        System.out.println("Name:"+person.get("name"));
        System.out.println("Height:"+person.get("height"));

        //3.get all keys
        Set<String> keys = person.keySet();
        for(String k:keys){
            System.out.println(k+"--"+person.get(k));
        }

        System.out.println(person.size());
        System.out.println(person.containsKey("Height"));
    }
}
