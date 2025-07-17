import java.util.Arrays;
import java.util.Scanner;

public class Task07_RadixSort {
    // Function to get the maximum value in arr[]
    static int getMax(int arr[]) {
        int mx = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }

    // A function to do counting sort of arr[] according to the digit represented by
    // exp
    static void countSort(int arr[], int exp) {
        int n = arr.length;
        int output[] = new int[n];
        int count[] = new int[10];
        Arrays.fill(count, 0);

        for (int i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (int i = 0; i < n; i++)
            arr[i] = output[i];
    }

    // The main function to that sorts arr[] of size n using Radix Sort
    static void radixSort(int arr[]) {
        int m = getMax(arr);
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, exp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers separated by spaces: ");
        String[] parts = sc.nextLine().split(" ");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }
        radixSort(arr);
        System.out.print("Sorted array: ");
        for (int n : arr)
            System.out.print(n + " ");
        System.out.println();
        sc.close();
    }
}
