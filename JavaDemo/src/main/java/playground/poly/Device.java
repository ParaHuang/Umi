package playground.poly;

public abstract class Device {
    //Fields
    private String brand;
    private double price;

    // Getter & Setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Construktor
    public Device(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    //Methode without Body
    public abstract void displayInfo();
}
