import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Day34_LongestIncreasingSubsequence {

    public static int lengthOfLIS(int[] nums) {
        if (nums.length == 0)
            return 0;

        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int maxLength = 0;
        for (int length : dp) {
            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }

    public static List<Integer> findLIS(int[] nums) {
        if (nums.length == 0)
            return new ArrayList<>();

        int[] dp = new int[nums.length];
        int[] parent = new int[nums.length];
        Arrays.fill(dp, 1);
        Arrays.fill(parent, -1);

        int maxLength = 1;
        int maxIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    parent[i] = j;
                }
            }

            if (dp[i] > maxLength) {
                maxLength = dp[i];
                maxIndex = i;
            }
        }

        List<Integer> lis = new ArrayList<>();
        int current = maxIndex;

        while (current != -1) {
            lis.add(nums[current]);
            current = parent[current];
        }

        Collections.reverse(lis);
        return lis;
    }

    public static int lengthOfLISOptimized(int[] nums) {
        List<Integer> tails = new ArrayList<>();

        for (int num : nums) {
            int left = 0, right = tails.size();

            while (left < right) {
                int mid = left + (right - left) / 2;
                if (tails.get(mid) < num) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            if (left == tails.size()) {
                tails.add(num);
            } else {
                tails.set(left, num);
            }
        }

        return tails.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Array: " + Arrays.toString(nums));

        int lisLength = lengthOfLIS(nums);
        System.out.println("Length of LIS: " + lisLength);

        List<Integer> lis = findLIS(nums);
        System.out.println("LIS sequence: " + lis);

        int optimizedLength = lengthOfLISOptimized(nums);
        System.out.println("Length of LIS (optimized): " + optimizedLength);

        System.out.println("\n--- Test Cases ---");
        int[][] testCases = {
                { 10, 9, 2, 5, 3, 7, 101, 18 },
                { 0, 1, 0, 3, 2, 3 },
                { 7, 7, 7, 7, 7, 7, 7 },
                { 1, 3, 6, 7, 9, 4, 10, 5, 6 }
        };

        for (int[] test : testCases) {
            int result = lengthOfLIS(test);
            List<Integer> sequence = findLIS(test);
            System.out.println(Arrays.toString(test) + " -> Length: " + result + ", LIS: " + sequence);
        }

        scanner.close();
    }
}