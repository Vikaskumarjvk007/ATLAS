import java.util.*;
import java.util.stream.Collectors;

public class Task011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers separated by spaces (with possible duplicates):");
        String input = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(input.trim().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        // Remove duplicates using distinct()
        List<Integer> RemovDups = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Original numbers: " + numbers);
        System.out.println("After removing duplicates: " + RemovDups);
    }
}
