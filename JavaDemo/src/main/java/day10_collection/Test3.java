package day10_collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        String[] names = {"Jhon","Jack","Alex","Helan","Cecilia","Mia","Sonia","Tomas","Tyler","Chris"};
        Set<String> party_names = new HashSet<>();
        //fill this set with 5 different random people



        while (party_names.size() < 5) {
            int randomNum = (int) (Math.random() * names.length);
            party_names.add(names[randomNum]);
            System.out.println(names[randomNum]);


        }


        System.out.println(party_names);
    }
}
