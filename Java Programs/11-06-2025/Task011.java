import java.util.ArrayList;

public class Task011 {
    public static void main(String[] args) {
        // Create an ArrayList of Integers
        ArrayList<Integer> list = new ArrayList<>();

        // Add 10 elements to the ArrayList using a for loop
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        // Display the elements using a for loop
        System.out.println("ArrayList elements:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
