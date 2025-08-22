package day7.polymorphism;

public class Main1 {
    public static void main(String[] args) {
        Chinese c = new Chinese();
        Japanese j = new Japanese();
        American a = new American();
        German g = new German();

        Club club = new Club();
        club.party(c);//calling/using a method with a actual value
        club.party(j);
        club.party(a);
        club.party(g);
    }
}
//irrelevant class
class Club{
    public void party(Human human){//define a method with format parameter
        System.out.println("Club party starts....");
        //people eat
        human.eat();
        System.out.println("Club party ends,please go home....");
        //people sleep
        human.sleep();
        System.out.println();
    }
}



/*
Human
|
-----------------------------
|           |              |
Chinese     Japanese        American
 */
abstract class Human{
    //1.when the definition of a method is important, but method body is not, then we can delete method body
    //2.if a method has no body, then it's abstract
    //3.if a class has an abstract method, then this class is also abstract
    //4.SubClass are forced to override abstract method from SuperClass -> force polymorphism happen
    public abstract void eat();

    public void sleep(){
        System.out.println("Human sleep");
    }
}

class Chinese extends Human{
    @Override
    public void eat() {
        System.out.println("Chinese eat with chopsticks");
    }

    public void kungFu(){
        System.out.println("Chinese knows kungFu");
    }
}

class Japanese extends Human{
    @Override
    public void eat() {
        System.out.println("Japanese like sushi");
    }
}

class American extends Human{
    @Override
    public void eat() {
        System.out.println("American like burger");
    }
}

class German extends Human{
    @Override
    public void eat() {
        System.out.println("German like sausage");
    }
}
