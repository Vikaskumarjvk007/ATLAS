public class CustomQueue {
    int[] arr; // Array to store queue elements
    int front = 0, rear = -1, size = 0, cap; // front: index of front, rear: index of rear, size: current size, cap: capacity
    CustomQueue(int c) { arr = new int[c]; cap = c; } // Constructor
    boolean isEmpty() { return size == 0; } // Check if queue is empty
    boolean isFull() { return size == cap; } // Check if queue is full
    void enque(int v) { // Add element to rear
        if (isFull()) return;
        rear = (rear + 1) % cap;
        arr[rear] = v; size++;
    }
    int deque() { // Remove element from front
        if (isEmpty()) return -1;
        int val = arr[front];
        front = (front + 1) % cap; size--;
        return val;
    }
    int peek() { // Get front element
        return isEmpty() ? -1 : arr[front];
    }
    void display() { // Display all elements
        for (int i = 0; i < size; i++)
            System.out.print(arr[(front + i) % cap] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        CustomQueue q = new CustomQueue(5); // Create queue of size 5
        q.enque(10); // Enqueue 10
        q.enque(20); // Enqueue 20
        q.enque(30); // Enqueue 30
        q.display(); // Display queue
        System.out.println("Dequeued: " + q.deque()); // Dequeue and print
        System.out.println("Peek: " + q.peek()); // Peek and print
        q.display(); // Display queue
    }
}
