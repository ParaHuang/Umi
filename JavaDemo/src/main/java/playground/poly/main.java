package playground.poly;

public class main {
    public static void main(String[] args) {
        // Inheritance und Polymorphism testen

        // 1. Laptop-Objekt erstellen
        Laptop myLaptop = new Laptop("Apple", 1300);

        // 2. Computer-Objekt erstellen
        Computer myComputer = new Computer("HP", 900);

        // 3. Polymorphism - gleiche Methode
        System.out.println("Laptop");
        myLaptop.displayInfo();

        System.out.println("Computer");
        myComputer.displayInfo();

        System.out.println("Poly");
        // Device-Referenz, aber verschiedene Objekte
        Device device1 = new Laptop("Apple", 2500);
        Device device2 = new Computer("Asus", 1100);

        device1.displayInfo();
        System.out.println();
        device2.displayInfo();
    }
}