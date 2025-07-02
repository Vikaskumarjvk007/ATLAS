import java.util.stream.Stream;

public class Task015 {
    public static void main(String[] args) {
        // Create a stream of integers from 1, incrementing by 1, limit to 20 values
        Stream<Integer> nums = Stream.iterate(1, n -> n + 1).limit(20);
        // Skip the first 15 numbers
        Stream<Integer> skipNums = nums.skip(15);
        // Print the remaining numbers using forEach
        System.out.println("Numbers after skipping the first 15:");
        skipNums.forEach(System.out::println);
    }
}
