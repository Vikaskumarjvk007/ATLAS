class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Task_SinglyLinkedList {
    Node head;

    // Add element to the end
    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Traverse and print elements
    void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Task_SinglyLinkedList list = new Task_SinglyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.print("Singly Linked List: ");
        list.traverse();
    }
}
