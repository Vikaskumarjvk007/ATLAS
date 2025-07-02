import java.util.*;

public class Task011_DS_Linkedlist {
    public static void main(String args[]) {
        LinkedList<String> ll = new LinkedList<>();
        ll.push("One");
        ll.push("Two");
        ll.push("Three");
        ll.push("Four");
        ll.push("Five");

        System.out.println("LinkedList after push: " + ll);

        String popped = ll.pop();
        System.out.println("Element popped: " + popped);
        System.out.println("LinkedList after pop: " + ll);
    }
}
