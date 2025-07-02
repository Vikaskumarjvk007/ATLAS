import java.util.*;

public class Task014_DS_Linkedlist_SplitIterator {
    public static void main(String[] args) {
        LinkedList<String> lobj = new LinkedList<>();
        lobj.add("Prasunamba");
        lobj.add("Meher");
        lobj.add(".MK");
        lobj.add("Vikas");
        lobj.add("Ravi");

        Spliterator<String> itobj1 = lobj.spliterator();
        Spliterator<String> itobj2 = itobj1.trySplit();

        System.out.println("Items from itobj1:");
        while (itobj1 != null && itobj1.tryAdvance(n -> System.out.println(n)));

        System.out.println("Items from itobj2:");
        while (itobj2 != null && itobj2.tryAdvance(n -> System.out.println(n)));
    }
}
