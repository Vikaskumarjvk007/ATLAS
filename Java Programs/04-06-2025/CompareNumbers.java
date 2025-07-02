import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        int a = sc.nextInt();
        System.out.print("Enter value for b: ");
        int b = sc.nextInt();

        String result = (a > b) ? "a is greater" : ((b > a) ? "b is greater" : "Both are equal");
        System.out.println(result);

        sc.close();
    }
}