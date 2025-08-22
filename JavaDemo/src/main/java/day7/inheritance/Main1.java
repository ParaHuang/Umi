package day7.inheritance;
//drivrer class
public class Main1 {
    public static void main(String[] args) {
//        Human h =  new Human();
        Student s = new Student(13);
    }
}

//1.when you are initializing the object of SubClass, have to firstly initialize the object of SuperClass
//2.there is an invisible code super() inside of the constructor of SubClass
//3.when there is only constructor with parameters inside SuperClass, then there would be compile error
//4.solution:a.supply an empty constructor    b.supply super(value1,value2,value3) inside constructor of subclass
class Human{
    private int age;
    public Human(int age){
        this.age = age;
        System.out.println("creating Human...");
    }
    //public Human(){}
}

class Student extends Human{
    public Student(int age) {
        //super();
        super(age);
        System.out.println("creating Student...");
    }
}

//this();