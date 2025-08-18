package day6_inheritance;

//inheritance:
//class SubClass extends SuperClass{}
//SubClass/ChildClass
//SuperClass/ParentClass/BaseClass
//SubClass will inherit public member from SuperClass
public class Chinese extends Human{
    @Override
    public void eat() {
        System.out.println("Chinese eat with chopsticks");
    }

    public void kungFu(){
        System.out.println("Chinese knows kung fu");
    }
}

//single extends,multiple implements
class A{}
class B{}
class C extends A{}