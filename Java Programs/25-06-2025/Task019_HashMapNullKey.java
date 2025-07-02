
// Task 19: Add 1/null as keys in a HashMap and observe results
import java.util.*;

public class Task019_HashMapNullKey {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(null, "NullValue");
        map.put(2, "Two");
        System.out.println("HashMap: " + map);
        System.out.println("Value for key 1: " + map.get(1));
        System.out.println("Value for key null: " + map.get(null));
    }
}
