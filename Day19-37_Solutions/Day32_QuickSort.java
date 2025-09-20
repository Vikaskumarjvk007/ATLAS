import java.util.Scanner;

public class Day32_QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSortIterative(int[] arr) {
        if (arr.length <= 1)
            return;

        int[] stack = new int[arr.length];
        int top = -1;

        stack[++top] = 0;
        stack[++top] = arr.length - 1;

        while (top >= 0) {
            int high = stack[top--];
            int low = stack[top--];

            int pivotIndex = partition(arr, low, high);

            if (pivotIndex - 1 > low) {
                stack[++top] = low;
                stack[++top] = pivotIndex - 1;
            }

            if (pivotIndex + 1 < high) {
                stack[++top] = pivotIndex + 1;
                stack[++top] = high;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
            arr2[i] = arr1[i];
        }

        System.out.println("Original array:");
        printArray(arr1);

        System.out.println("\n--- Recursive Quick Sort ---");
        long startTime = System.nanoTime();
        quickSort(arr1, 0, arr1.length - 1);
        long endTime = System.nanoTime();

        System.out.println("Sorted array (recursive):");
        printArray(arr1);
        System.out.println("Time taken: " + (endTime - startTime) / 1000000.0 + " ms");

        System.out.println("\n--- Iterative Quick Sort ---");
        startTime = System.nanoTime();
        quickSortIterative(arr2);
        endTime = System.nanoTime();

        System.out.println("Sorted array (iterative):");
        printArray(arr2);
        System.out.println("Time taken: " + (endTime - startTime) / 1000000.0 + " ms");

        scanner.close();
    }
}