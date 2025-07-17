import java.util.Scanner;

public class Task02_DisplayDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 6 digit number: ");
        int num = sc.nextInt();
        int[] digits = new int[6];
        int temp = num;
        for (int i = 5; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        String[] places = { "Lakhs digit is ", "10 thousands digit is ", "Thousands digit is ", "Hundreds digit is ",
                "Ones digit is ", "Units digit is " };
        for (int i = 0; i < 6; i++) {
            System.out.println(places[i] + digits[i]);
        }
        sc.close();
    }
}
