import java.util.Scanner;

public class Task03_CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        int count = 0;
        long temp = Math.abs(num);
        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                count++;
                temp /= 10;
            }
        }
        System.out.println("Its a " + count + " digit number");
        sc.close();
    }
}
