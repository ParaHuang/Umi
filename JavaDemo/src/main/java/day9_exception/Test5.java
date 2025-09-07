package day9_exception;

public class Test5 {
    public static void main(String[] args) {
        Person p1 = new Person();
        try {
            p1.setAge(-10);
        } catch (AgeException e) {
            e.printStackTrace();
        }

        System.out.println("the end");
    }
}

class Person{
    private String name;
    private int age;

    public void setAge(int age) throws AgeException {
        if(age<0 || age>150){
            throw new AgeException(age+" is invalid because it's not from 1 to 150");
        }
        this.age = age;
    }
}

//customized runtime exception
//class AgeException extends RuntimeException{
//    public AgeException(String msg){
//        super(msg);
//    }
//}

//customized compile exception
class AgeException extends Exception{
    public AgeException(String msg){
        super(msg);
    }
}