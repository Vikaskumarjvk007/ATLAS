import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day20_TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = scanner.nextInt();

        System.out.println("Array: " + java.util.Arrays.toString(nums));
        System.out.println("Target: " + target);

        int[] result = twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Found two numbers at indices: " + result[0] + " and " + result[1]);
            System.out.println("Numbers are: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
        } else {
            System.out.println("No two numbers found that add up to target");
        }

        scanner.close();
    }
}