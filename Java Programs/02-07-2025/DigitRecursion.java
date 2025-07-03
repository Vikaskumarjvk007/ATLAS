import java.util.Scanner;

public class DigitRecursion {
    // Recursive function to count digits
    public static int countDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + countDigits(n / 10);
    }

    // Recursive function to sum digits
    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        System.out.println("Number of digits: " + countDigits(num));
        System.out.println("Sum of digits: " + sumDigits(num));
    }
}
