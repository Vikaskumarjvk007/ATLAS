import java.util.*;
import java.util.stream.Collectors;

public class Task007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers separated by spaces:");
        String input = scanner.nextLine();
        // Split input and parse integers
        List<Integer> numbers = Arrays.stream(input.trim().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        // Calculate the square of each number using streams
        List<Integer> squareofNums = numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());
        // Display the squares
        System.out.println("Original numbers: " + numbers);
        System.out.println("Squares: " + squareofNums);
    }
}
