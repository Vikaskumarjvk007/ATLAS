import java.util.*;
import java.util.stream.Collectors;

public class Task009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers separated by spaces:");
        String input = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(input.trim().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        // Filter odd numbers
        List<Integer> oddNumbers = numbers.stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("Original numbers: " + numbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}
