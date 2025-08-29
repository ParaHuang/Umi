package playground.poly;

//extenden
public class Laptop extends Device{

    //Override template
    @Override
    public void displayInfo() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Price: "+ getPrice());

    }

    //Constructor to Abstruct
    public Laptop(String brand, double price) {
        super(brand, price);
    }
}
