import java.util.Scanner;

public class LoginValidationDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctId = "Prasunamba";
        String correctPwd = "12345867";
        int count = 0;
        String loginid = "";
        String pwd = "";

        do {
            System.out.println("You have logged in for " + count++ + " times");
            System.out.println("Enter your login id and password");
            loginid = sc.nextLine();
            pwd = sc.nextLine();
        } while (loginid.equals(correctId) && pwd.equals(correctPwd));

        System.out.println("Invalid login id or password");
        sc.close();
    }
}