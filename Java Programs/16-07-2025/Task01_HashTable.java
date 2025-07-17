import java.util.LinkedList;

class Task01 {
    LinkedList<Entry>[] data = new LinkedList[10];

    public void put(String keyval, int value) {
        int index = Math.abs(keyval.hashCode() % data.length);
        if (data[index] == null) {
            data[index] = new LinkedList<>();
        }
        for (Entry e : data[index]) {
            if (e.keyval.equals(keyval)) {
                e.value = value;
                return;
            }
        }
        data[index].add(new Entry(keyval, value));
    }

    public Integer get(String keyval) {
        int index = Math.abs(keyval.hashCode() % data.length);
        if (data[index] != null) {
            for (Entry e : data[index]) {
                if (e.keyval.equals(keyval)) {
                    return e.value;
                }
            }
        }
        return null;
    }

    static class Entry {
        String keyval;
        int value;

        Entry(String k, int v) {
            keyval = k;
            value = v;
        }
    }

    public static void main(String[] args) {
        Task01 ht = new Task01();
        ht.put("apple", 10);
        ht.put("banana", 20);
        ht.put("orange", 30);
        ht.put("apple", 40); // update value
        System.out.println("apple: " + ht.get("apple"));
        System.out.println("banana: " + ht.get("banana"));
        System.out.println("orange: " + ht.get("orange"));
        System.out.println("grape: " + ht.get("grape")); // not present
    }
}
