import java.util.Scanner;

public class LoginValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctId = "Prasunamba";
        String correctPwd = "12345867";
        int count = 0;
        String loginid = "";
        String pwd = "";

        while (true) {
            System.out.print("Enter your login id: ");
            loginid = sc.nextLine();
            System.out.print("Enter your password: ");
            pwd = sc.nextLine();

            if (loginid.equals(correctId) && pwd.equals(correctPwd)) {
                count++;
                System.out.println("You have logged in for " + count + " times");
            } else {
                System.out.println("Invalid login id or password");
                break;
            }
        }
        sc.close();
    }
}