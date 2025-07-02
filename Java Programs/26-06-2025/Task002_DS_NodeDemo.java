import java.util.NoSuchElementException;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class CustomLinkedList<T> {
    private Node<T> head;
    private int size = 0;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public T removeFirst() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        T removedData = head.data;
        head = head.next;
        size--;
        return removedData;
    }

    public T get(int index) {
        checkBounds(index);
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int size() {
        return size;
    }

    private void checkBounds(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    public static void main(String[] args) {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.add(10);
        list.add(20);
        list.addFirst(5);
        System.out.println("List size: " + list.size());
        System.out.println("First element removed: " + list.removeFirst());
        System.out.println("Element at index 0: " + list.get(0));
    }
}
