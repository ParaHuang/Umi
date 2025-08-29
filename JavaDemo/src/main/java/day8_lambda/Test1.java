package day8_lambda;

public class Test1 {
    public static void main(String[] args) {
//        America a = new America();
//        a.pray();

        //create an object of interface, need to override the abstract method
        Believer b = new Believer(){
            @Override
            public void pray() {
                System.out.println("a mi tuo fo");
            }

            @Override
            public void eat() {

            }
        };
        b.pray();
    }
}

interface Believer{
    void pray();
    void eat();
}

class America implements Believer{

    @Override
    public void pray() {
        System.out.println("Amen");
    }

    @Override
    public void eat() {

    }
}


