class Node {
    int data;
    Node prev, next;
    Node(int d) { data = d; }
}

public class DoublyLinkedList {
    Node head;
    
    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) last = last.next;
            last.next = newNode;
            newNode.prev = last;
        }
    }
    
    void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.print(); // Output: 10 20 30
    }
}