// Task Add-on: Linear Probing Hash Table (Full Code)
// Simple implementation for demonstration
class LinearProbingHashTable {
    private int[] table;
    private int size;

    public LinearProbingHashTable(int capacity) {
        table = new int[capacity];
        for (int i = 0; i < capacity; i++)
            table[i] = -1;
        size = capacity;
    }

    public void insert(int key) {
        int idx = key % size;
        int startIdx = idx;
        while (table[idx] != -1) {
            idx = (idx + 1) % size;
            if (idx == startIdx)
                return; // Table full
        }
        table[idx] = key;
    }

    public boolean search(int key) {
        int idx = key % size;
        int startIdx = idx;
        while (table[idx] != -1) {
            if (table[idx] == key)
                return true;
            idx = (idx + 1) % size;
            if (idx == startIdx)
                break;
        }
        return false;
    }

    public void display() {
        for (int i = 0; i < size; i++)
            System.out.print(table[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        LinearProbingHashTable ht = new LinearProbingHashTable(7);
        ht.insert(10);
        ht.insert(20);
        ht.insert(5);
        ht.insert(15);
        ht.display();
        System.out.println("Search 20: " + ht.search(20));
        System.out.println("Search 99: " + ht.search(99));
    }
}
