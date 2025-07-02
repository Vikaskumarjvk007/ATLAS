public class SimpleStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public SimpleStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Push element onto stack
    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // Pop element from stack
    public int pop() {
        if (top >= 0) {
            return stackArray[top--];
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    // Peek at the top element
    public int peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    public static void main(String[] args) {
        SimpleStack stack = new SimpleStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());
        stack.pop();
        stack.pop(); // Should show underflow
    }
}
