import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task017 {
    public static void main(String[] args) {
        // Mutable: changeable (e.g., int)
        // Immutable: cannot be changed (e.g., Integer, Long - wrapper classes)

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // Using reduce() to sum all elements
        Optional<Integer> sum = numbers.stream().reduce((x, y) -> x + y);
        System.out.println("Sum of all elements: " + sum.orElse(0));

        // Using reduce() to find the maximum element
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        System.out.println("Maximum element: " + max.orElse(0));

        // Using reduce() to concatenate strings
        List<String> strings = Arrays.asList("Hello", " ", "world", "!");
        Optional<String> concatenatedString = strings.stream().reduce((x, y) -> x + y);
        System.out.println("Concatenated string: " + concatenatedString.orElse(""));
    }
}
