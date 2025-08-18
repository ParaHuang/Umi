package day6_inheritance;

public class Japanese extends Human{
    //int x;
    //method override
//    public void eat() {
//        System.out.println("Japanese eat Sushi a lot");
//    }

    //annotation
    @Override
    public void eat() {
       x = 10;
        //this.eat();//recursion
        super.eat();    //super:the object of SuperClass
        System.out.println("Japanese eat Sushi a lot");
    }
}


//overload:methods in the same name, but with different parameters
//override:Subclass rewrite the method from SuperClass