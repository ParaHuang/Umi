package day5_oop.encapsulation;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //initialize
        Student stu = new Student(1001,"Jack",18,"M");
//        stu.setId(90);
//        stu.setName("Jhon");
//        stu.setAge(18);
//        stu.setGender("M");


//        System.out.println(stu.getId()+","+stu.getName()+","+stu.getAge()+","+stu.getGender());

        Student stu2 = new Student(1001,"Tom");
        Student stu3 = new Student();

        System.out.println(stu);
        System.out.println(stu2);
        System.out.println(stu3);

//        Random random = new Random();
//        random.nextInt
    }
}
