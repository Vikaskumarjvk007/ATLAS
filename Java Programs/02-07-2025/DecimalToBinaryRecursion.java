import java.util.Scanner;

public class DecimalToBinaryRecursion {
    // Recursive function to print binary representation
    public static void toBinary(int n) {
        if (n == 0) {
            return;
        }
        toBinary(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = -1;
        while (num < 0) {
            System.out.print("Enter a positive integer: ");
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                if (num < 0) {
                    System.out.println("Please enter a non-negative integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next(); // consume invalid input
            }
        }
        if (num == 0) {
            System.out.print(0);
        } else {
            toBinary(num);
        }
        System.out.println();
    }
}
