import java.util.Scanner;
import java.util.Stack;

public class Day27_ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with brackets: ");
        String input = scanner.nextLine();

        System.out.println("Input: \"" + input + "\"");

        boolean result = isValid(input);

        if (result) {
            System.out.println("The brackets are valid and properly balanced!");
        } else {
            System.out.println("The brackets are NOT valid or balanced.");
        }

        System.out.println("\n--- Test Cases ---");
        String[] testCases = {
                "()", "()[]{}", "(]", "([)]", "{[]}", "((()))", ")("
        };

        for (String test : testCases) {
            System.out.println("\"" + test + "\" -> " +
                    (isValid(test) ? "Valid" : "Invalid"));
        }

        scanner.close();
    }
}