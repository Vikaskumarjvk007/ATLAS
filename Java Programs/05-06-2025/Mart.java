// Corrected version of the provided code
// Demonstrates inheritance and use of super keyword in Java

class Customer {
    int cost = 40;
    String items = "Tomatoes";
}

public class Mart extends Customer {
    int cost = 30;
    String items = "onions";

    void billing() {
        System.out.println(items);
        System.out.println(cost);
        System.out.println("%%%%%%%%%%%%%%");
        System.out.println(super.items);
        System.out.println(super.cost);
    }

    public static void main(String[] args) {
        Mart m = new Mart();
        m.items = "Potatoes";
        m.cost = 50;
        m.billing();
    }
}
