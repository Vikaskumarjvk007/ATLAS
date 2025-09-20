import java.util.Arrays;
import java.util.Scanner;

public class Day19_ArrayRotation {

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter number of positions to rotate: ");
        int k = scanner.nextInt();

        System.out.println("Original array: " + Arrays.toString(arr));

        rotateArray(arr, k);

        System.out.println("Array after rotating by " + k + " positions: " + Arrays.toString(arr));

        scanner.close();
    }
}