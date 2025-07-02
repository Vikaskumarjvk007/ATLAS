import java.util.stream.Stream;

public class Task014 {
    public static void main(String[] args) {
        // Create a stream of integers from 1, incrementing by 1, limit to 20 values
        Stream<Integer> nums = Stream.iterate(1, n -> n + 1).limit(20);
        // Display the first 10 numbers using forEach
        System.out.println("First 10 numbers from the stream:");
        nums.limit(10).forEach(System.out::println);
    }
}
