package playground.collection;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionExer {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<String>();
        people.add("John");
        people.add("Jack");
        people.add("Alex");
        people.add("Helan");
        people.add("Cecilia");
        people.add("Mia");
        people.add("Sonia");
        people.add("Tomas");
        people.add("Tyler");
        people.add("Chris");
        //System.out.println(people);

//        Collections.shuffle(people);
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(people.get(i));
//        }



        for (int i = 0; i < 5; i++) {
            int randomNum = (int) (Math.random() * people.size());
            System.out.println(people.get(randomNum));
            people.remove(randomNum);
        }



    }
}
