import java.util.*;

public class Task005_DS_Linkedlist {
    public static void main(String args[]) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Prasunamba");
        ll.add("Meher");
        ll.add("Ravi");
        ll.add("Sita");
        ll.add("John");

        System.out.println("Initial LinkedList: " + ll);

        // Replace 3rd element (index 2)
        ll.set(2, "Vikas");

        System.out.println("Updated LinkedList: " + ll);
    }
}
