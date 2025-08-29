package playground.poly;

//extenden
public class Computer extends Device{

    //Override template
    @Override
    public void displayInfo() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Price: $" + getPrice());
    }

    //Constructor to Abstract
    public Computer(String brand, double price) {
        super(brand, price);
    }
}