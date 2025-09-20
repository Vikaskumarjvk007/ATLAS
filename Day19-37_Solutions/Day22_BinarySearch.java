import java.util.Scanner;

public class Day22_BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, target, mid + 1, right);
        } else {
            return binarySearchRecursive(arr, target, left, mid - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of sorted array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter sorted array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter target to search: ");
        int target = scanner.nextInt();

        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Target: " + target);

        int result1 = binarySearch(arr, target);
        System.out.println("\nUsing the iterative version:");
        if (result1 != -1) {
            System.out.println("Found it at index: " + result1);
        } else {
            System.out.println("Nope, not in the array");
        }

        int result2 = binarySearchRecursive(arr, target, 0, arr.length - 1);
        System.out.println("\nUsing recursion:");
        if (result2 != -1) {
            System.out.println("Found it at index: " + result2);
        } else {
            System.out.println("Still not there!");
        }

        scanner.close();
    }
}