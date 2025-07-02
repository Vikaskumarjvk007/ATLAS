import java.util.Scanner;

public class UserLoginDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your login id: ");
        String id = sc.nextLine();

        System.out.print("Enter your password: ");
        String pwd = sc.nextLine();

        System.out.println();
        System.out.println("Hi ,");
        System.out.println("\tYour login id is " + id);
        System.out.println("And your pwd is *********");

        sc.close();
    }
}