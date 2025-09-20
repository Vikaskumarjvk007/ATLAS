import java.util.Scanner;

public class Day26_MaxSubarraySum {

    public static int maxSubarraySum(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static class SubarrayResult {
        int maxSum;
        int startIndex;
        int endIndex;

        SubarrayResult(int sum, int start, int end) {
            this.maxSum = sum;
            this.startIndex = start;
            this.endIndex = end;
        }
    }

    public static SubarrayResult maxSubarrayWithIndices(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];
        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < arr.length; i++) {
            if (currentSum < 0) {
                currentSum = arr[i];
                tempStart = i;
            } else {
                currentSum += arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        return new SubarrayResult(maxSum, start, end);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Array: " + java.util.Arrays.toString(arr));

        int maxSum = maxSubarraySum(arr);
        System.out.println("Maximum subarray sum: " + maxSum);

        SubarrayResult result = maxSubarrayWithIndices(arr);
        System.out.println("Maximum subarray: ");
        System.out.println("Sum: " + result.maxSum);
        System.out.println("Start index: " + result.startIndex);
        System.out.println("End index: " + result.endIndex);

        System.out.print("Subarray elements: ");
        for (int i = result.startIndex; i <= result.endIndex; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}