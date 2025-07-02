// Task036: Demonstrate method overloading with int and float parameter order
public class Task036 {
    // Method with int and float parameters
    void add(int x, float y) {
        System.out.println("x = " + x + ", y = " + y);
    }

    // Method with float and int parameters
    void add(float x, int y) {
        System.out.println("x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        Task036 obj = new Task036();
        obj.add(10.50f, 60);
        obj.add(100, 80.80f);
    }
}
