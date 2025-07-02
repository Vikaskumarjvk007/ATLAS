import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Task021_DS_HashMap_SyncMap {
    public static void main(String[] args) {
        HashMap<String, Integer> Hm1 = new HashMap<String, Integer>();
        Map<String, Integer> syncMap = Collections.synchronizedMap(Hm1);

        // Add some values
        syncMap.put("A", 1);
        syncMap.put("B", 2);
        syncMap.put("C", 3);

        // Print the synchronized map
        System.out.println("Synchronized Map: " + syncMap);
    }
}
