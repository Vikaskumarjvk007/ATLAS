// Task035: Demonstrate method overloading with different parameter types in Java
public class Task035 {
    // Method with char parameters
    void add(char x, char y) {
        System.out.println("x = " + x + ", y = " + y);
    }

    // Method with int parameters
    void add(int x, int y) {
        System.out.println("x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        Task035 obj = new Task035();
        obj.add('d', 'a');
        obj.add(100, 100);
    }
}
