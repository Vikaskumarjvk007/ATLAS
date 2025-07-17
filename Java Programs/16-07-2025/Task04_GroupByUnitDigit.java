import java.util.*;

public class Task04_GroupByUnitDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers separated by commas: ");
        String input = sc.nextLine();
        String[] parts = input.split(",");
        List<Integer> arr1 = new ArrayList<>(); // unit digit 0
        List<Integer> arr2 = new ArrayList<>(); // unit digit 1
        List<Integer> arr3 = new ArrayList<>(); // unit digit 5

        for (String part : parts) {
            int num = Integer.parseInt(part.trim());
            int unit = num % 10;
            if (unit == 0) {
                arr1.add(num);
            } else if (unit == 1) {
                arr2.add(num);
            } else if (unit == 5) {
                arr3.add(num);
            }
        }
        System.out.print("Array 1 has : ");
        for (int n : arr1) System.out.print(n + ", ");
        System.out.println();
        System.out.print("Array 2 has : ");
        for (int n : arr2) System.out.print(n + ", ");
        System.out.println();
        System.out.print("Array 3 has : ");
        for (int n : arr3) System.out.print(n + ", ");
        System.out.println();
        sc.close();
    }
}
