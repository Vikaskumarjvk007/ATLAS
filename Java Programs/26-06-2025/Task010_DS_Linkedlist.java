import java.util.*;

public class Task010_DS_Linkedlist {
    public static void main(String args[]) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Alpha");
        ll.add("Beta");
        ll.add("Gamma");
        ll.add("Delta");
        ll.add("Epsilon");

        System.out.println("LinkedList: " + ll);

        // Iterate using ListIterator
        ListIterator<String> it = ll.listIterator();
        System.out.print("Iterating using ListIterator: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}
