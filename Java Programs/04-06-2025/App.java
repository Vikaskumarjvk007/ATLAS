public class App {

    // Method with a parameter
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Overloaded method with no parameters
    public static void greet() {
        System.out.println("Hello, stranger!");
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Calling the methods
        greet("Alice"); // Calls the greet(String name) method
        greet();       // Calls the overloaded greet() method
    }
}
