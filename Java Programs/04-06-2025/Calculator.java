import java.util.Scanner;

public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return Double.NaN; // Return Not-a-Number for division by zero
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Main started");
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();

        System.out.println("Sum of 2 numbers is " + add(a, b));
        System.out.println("Diff of 2 numbers is " + subtract(a, b));
        System.out.println("Product of 2 numbers is " + multiply(a, b));
        System.out.println("Division of 2 numbers is " + divide(a, b));
        System.out.println("Main ended");
        scanner.close();
    }
}