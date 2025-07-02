import java.util.*;

public class Task006_DS_Linkedlist {
    public static void main(String args[]) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Prasunamba");
        ll.add("Meher");
        ll.add("Ravi");
        ll.add("Sita");
        ll.add("John");

        System.out.println("Initial LinkedList: " + ll);

        // Remove 4th element (index 3)
        ll.remove(3);

        System.out.println("LinkedList after removing 4th element: " + ll);
    }
}
