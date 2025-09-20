package day10_collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();    //adding order
        set.add(new Student("hello"));
        set.add(new Student("hey"));
        set.add(new Student("hi"));
        set.add(new Student("hi"));
        set.add(new Student("hola"));
        set.add(new Student("hola"));
        set.add(new Student("hallo"));
        //check duplicate :  equals + hashcode

        System.out.println(set);
        System.out.println(new Student("Jack"));

        /*
        String x = new String("hello");
        String y = new String("hello");
        System.out.println(x==y);               //compare address
        System.out.println(x.equals(y));        //compare content

        //constant pool:for String,Wrapper class
        String a = "hello";
        String b = "hello";
        System.out.println(a==b);               //compare address
        System.out.println(a.equals(b));
        //Type xx = new Type(value);
        */


    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    //override hashCode and equals methods
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
