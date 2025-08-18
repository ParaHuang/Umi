package day5_oop.encapsulation;

public class Student {
    private int id;
    private String name;//instance variable
    private int age;
    private String gender;

    //constructor:a special method
    //1.has no concept of return, in the same name as class
    //2.it's called by new
    //3.every class has an invisible constructor in the beginning,once you start to write it, then the invisible one disappear
    //4.we do initial setup in constructor
    //5.by methods overload, we can supply more ways to create object
    public Student(int id, String gender, int age, String name) {
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.name = name;
    }
    //method overload:methods are in the same name, but with different parameters
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
    }

    //    public Student(int id,String name,int age,String gender){
//        System.out.println("this is constructor");
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//    }


    //getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<3 || age>100){
            throw new RuntimeException(age + " is an invalid age");
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {//"John"
        //this->current object
        //when local variable(parameter) and global variable(field) are in the same name, use this.xxx to represent the field
        this.name = name;
    }

    public void test1(){

    }

    public void test1(int a){

    }

    //1.to return the String format of object information
    //2.print this object, this method will be called automatically/invisibly
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

//    public String toString(){
//        return id + "\t" + name + "\t" + age + "\t" + gender;
//    }

}
