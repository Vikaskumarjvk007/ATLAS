import java.util.*;

public class Task007_DS_Linkedlist {
    public static void main(String args[]) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Prasunamba");
        ll.add("Meher");
        ll.add("Ravi");
        ll.add("Sita");
        ll.add("John");

        System.out.println("LinkedList: " + ll);

        // Display using for loop with get()
        System.out.print("Using for loop with get(): ");
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }
        System.out.println();

        // Display using for-each loop
        System.out.print("Using for-each loop: ");
        for (String name : ll) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}
