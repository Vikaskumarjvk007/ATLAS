import java.util.Scanner;

public class ReverseNullTerminatedString {
    // Helper function to reverse a char array recursively
    public static void reverse(char[] str, int start, int end) {
        if (start >= end) {
            return;
        }
        char temp = str[start];
        str[start] = str[end];
        str[end] = temp;
        reverse(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string (null-terminated, use $ as null char): ");
        String input = sc.nextLine();
        int nullIndex = input.indexOf('$');
        if (nullIndex == -1) {
            System.out.println("No null terminator found. Reversing whole string.");
            nullIndex = input.length();
        }
        char[] arr = input.substring(0, nullIndex).toCharArray();
        reverse(arr, 0, arr.length - 1);
        System.out.println("Reversed string: " + new String(arr));
    }
}
