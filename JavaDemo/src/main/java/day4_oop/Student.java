package day4_oop;

//OOP:object-oriented programming
//encapsulation:to keep code safe. make fields private, make methods public, access private fields by public methods

//abstraction: finding out the common factors among objects:  object->class
public class Student {  //template of creating object
    //field,instance variable, member variable
    //number,name,age,gender,class
    private int number;
    private String name;
    private int age;
    private String gender;
    private String cls;

    //methods,member methods
    //set up a value    ->  setters -> public void setXxx(type xxx){}
    //get a value       ->  getters -> public type getXxx(){}
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }

    public void setAge(int a){
        //process of checking
        if(a>3 && a<110){
            age = a;
        }else{
//            System.out.println(a + " is out of range");
            throw new RuntimeException("invalid age");
        }

    }

    public int getAge() {
        return age;
    }
}
