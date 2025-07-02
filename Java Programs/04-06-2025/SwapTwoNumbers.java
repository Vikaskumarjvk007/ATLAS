import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Enter value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter value of b: ");
        int b = scanner.nextInt();

        // Swapping logic
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a=" + a + "  b=" + b);
        scanner.close();
    }
}