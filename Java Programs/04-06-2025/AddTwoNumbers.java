import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println(sum);
        scanner.close();
    }
}