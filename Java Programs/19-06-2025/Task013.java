import java.util.*;
import java.util.stream.Collectors;

public class Task013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your friends' names separated by commas:");
        String input = scanner.nextLine();
        List<String> Names = Arrays.stream(input.trim().split(","))
                .map(String::trim)
                .collect(Collectors.toList());
        // Sort the names
        List<String> SortedNames = Names.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Original names: " + Names);
        System.out.println("Sorted names: " + SortedNames);
    }
}
