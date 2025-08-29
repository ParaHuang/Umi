package day8_lambda;

//lambda：anonymous function of FunctionalInterface
public class Test2 {
    public static void main(String[] args) {
        A a = new A() {
            @Override
            public void test1() {

            }

            @Override
            public void test2() {

            }
        };

        B b1 = new B() {
            @Override
            public void test1() {
                System.out.println("test1");
            }
        };

        //()    is the format of parameter, you can write as (a,b,c)
        //{}    is the method body
        B b2 = ()->{
            System.out.println("test1");
        };

        //1.if there is only 1 code for method body, then we don't need {}
        B b3 = ()-> System.out.println("test1---B3");
        b3.test1();

        C c1 = ()->{
            System.out.println("test1 for C");
            System.out.println("test1 for C");
            System.out.println("test1 for C");
            System.out.println("test1 for C");
            return 5;
        };
        System.out.println(c1.test1());
        //2.if there is only 1 code for method body, and it's a return code, then we can directly write value that we want to return
        C c2 = ()->44555;
        System.out.println(c2.test1());

        D d1 = (num)->{
            return num*num;//return the power of a
        };
        D d2 = (int num)->num*num;
        System.out.println(d2.test1(10));
    }
}

interface A{
    void test1();
    void test2();
}

@FunctionalInterface    //the interface only with 1 abstract method
interface B{
    void test1();
}

interface C{
    int test1();
}

interface D{
    int test1(int a);
}
