import java.util.Scanner;

public class Task008_ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        String reversed = new StringBuilder(name).reverse().toString();
        System.out.println("Reversed name: " + reversed);
    }
}
