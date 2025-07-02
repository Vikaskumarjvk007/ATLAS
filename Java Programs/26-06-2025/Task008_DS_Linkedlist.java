import java.util.*;

public class Task008_DS_Linkedlist {
    public static void main(String args[]) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Apple");
        ll.add("Banana");
        ll.add("Cherry");
        ll.add("Date");
        ll.add("Elderberry");

        System.out.println("LinkedList: " + ll);

        // Convert to array
        String[] arr = ll.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(arr));
    }
}
