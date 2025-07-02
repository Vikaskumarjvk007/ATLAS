import java.util.*;

public class Task013_DS_HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hmobj1 = new HashMap<>();
        HashMap<Integer, String> hmobj2 = new HashMap<>();

        hmobj1.put(10, "Anitha");
        hmobj1.put(20, "Saritha");
        hmobj1.put(30, "Ankitha");

        hmobj2.put(44, "John");
        hmobj2.put(55, "Steve");
        hmobj2.put(66, "Jack");

        System.out.println("Mapping HashMap hmobj1: " + hmobj1);
        System.out.println("Mapping HashMap hmobj2: " + hmobj2);
    }
}
