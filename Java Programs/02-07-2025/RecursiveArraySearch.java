import java.util.Scanner;

public class RecursiveArraySearch {
    // Recursive function to search for an element in an array
    public static boolean search(int[] arr, int index, int target) {
        if (index >= arr.length) {
            return false;
        }
        if (arr[index] == target) {
            return true;
        }
        return search(arr, index + 1, target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();
        if (search(arr, 0, target)) {
            System.out.println(target + " is present in the array.");
        } else {
            System.out.println(target + " is not present in the array.");
        }
    }
}
