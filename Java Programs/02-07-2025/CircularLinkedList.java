class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head;

    // Add element to the end
    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Traverse and print elements
    void traverse() {
        if (head == null) return;
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList clist = new CircularLinkedList();
        clist.add(100);
        clist.add(200);
        clist.add(300);
        clist.add(400);
        System.out.print("Circular Linked List: ");
        clist.traverse();
    }
}
