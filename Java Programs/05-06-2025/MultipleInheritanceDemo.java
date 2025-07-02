// Demonstration of multiple inheritance in Java

class Calculation {
    int z;
    public void addition(int x, int y) {
        z = x + y;
        System.out.println("The sum of the given numbers: " + z);
    }
    public void subtraction(int x, int y) {
        z = x - y;
        System.out.println("The difference between the given numbers: " + z);
    }
}

class Clock {
    public void showTime() {
        System.out.println("Showing time...");
    }
}

// The following code will NOT compile in Java:
// class MyCalculation extends Calculation, Clock {
//     // ...
// }
// Reason: Java does NOT support multiple inheritance with classes.
// A class can only extend one class. To achieve similar behavior, use interfaces.

// Example using interfaces:
interface IClock {
    void showTime();
}

class MyCalculation2 extends Calculation implements IClock {
    public void showTime() {
        System.out.println("Showing time from interface...");
    }
    public static void main(String[] args) {
        MyCalculation2 obj = new MyCalculation2();
        obj.addition(10, 5);
        obj.subtraction(10, 5);
        obj.showTime();
    }
}

// Explanation:
// Java does not support multiple inheritance with classes (cannot extend more than one class).
// You can, however, extend one class and implement multiple interfaces.
