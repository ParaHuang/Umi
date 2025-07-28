package day4_oop;

import java.util.Random;

//entrance of program
public class Main {
    public static void main(String[] args) {
        //define variable
        //type variable = value;

        //initialization: class -> object
        //ClassName objectName = new ClassName();
        Random rand = new Random();
        //new:create
        Student stu1 = new Student();
        //. -> 's
//        stu1.number = 10;
//        stu1.age = 1800;
        stu1.setAge(-18);
//        stu1.name = "Jack";
        stu1.setName("John");
//        stu1.gender = "Male";
//        stu1.cls = "A8";

//        System.out.println(stu1.name);
        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());

//        stu1 = new Student();

        Student stu2 = new Student();
        //. -> 's
//        stu2.number = 1001;
//        stu2.age = 18;
//        stu2.name = "Tom";
//        stu2.gender = "Male";
//        stu2.cls = "A8";

    }
}
//file
//database