import java.util.Scanner;

public class Day21_PalindromeChecker {

    public static boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        System.out.println("Input string: \"" + input + "\"");

        boolean result = isPalindrome(input);

        if (result) {
            System.out.println("The string is a palindrome!");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        System.out.println("\n--- Additional Test Cases ---");
        String[] testCases = { "racecar", "A man a plan a canal Panama", "race a car", "hello" };

        for (String test : testCases) {
            System.out.println("\"" + test + "\" -> " + (isPalindrome(test) ? "Palindrome" : "Not Palindrome"));
        }

        scanner.close();
    }
}