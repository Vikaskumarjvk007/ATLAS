#include <iostream>
using namespace std;

struct Node
{
    int data;
    Node *prev;
    Node *next;
    Node(int d) : data(d), prev(nullptr), next(nullptr) {}
};

class DoublyLinkedList
{
    Node *head;

public:
    DoublyLinkedList() : head(nullptr) {}

    void add(int data)
    {
        Node *newNode = new Node(data);
        if (!head)
        {
            head = newNode;
        }
        else
        {
            Node *temp = head;
            while (temp->next)
                temp = temp->next;
            temp->next = newNode;
            newNode->prev = temp;
        }
    }

    void print()
    {
        Node *temp = head;
        while (temp)
        {
            cout << temp->data << " ";
            temp = temp->next;
        }
        cout << endl;
    }
};

int main()
{
    DoublyLinkedList list;
    list.add(10);
    list.add(20);
    list.add(30);
    list.print(); // Output: 10 20 30
    return 0;
}