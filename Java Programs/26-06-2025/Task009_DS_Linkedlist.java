import java.util.*;

public class Task009_DS_Linkedlist {
    public static void main(String args[]) {
        LinkedList<String> originalList = new LinkedList<>();
        originalList.add("Red");
        originalList.add("Green");
        originalList.add("Blue");
        originalList.add("Yellow");
        originalList.add("Purple");

        System.out.println("Original LinkedList: " + originalList);

        // Clone the linked list
        LinkedList<String> clonedList = (LinkedList<String>) originalList.clone();
        System.out.println("Cloned LinkedList: " + clonedList);
    }
}
