// Task024: Demonstrate method overloading in Java
public class Task024 {
    // Method with two parameters
    void add(int x, int y) {
        System.out.println("x = " + x + ", y = " + y);
    }

    // Overloaded method with three parameters
    void add(int x, int y, int z) {
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
    }

    public static void main(String[] args) {
        Task024 obj = new Task024();
        obj.add(10, 20, 30);
        obj.add(50, 100);
    }
}
