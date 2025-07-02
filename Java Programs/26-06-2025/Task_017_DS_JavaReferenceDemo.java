import java.util.Arrays;

// Custom classes to demonstrate reference behavior
class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "IntWrapper{value=" + value + "}";
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Task_017_DS_JavaReferenceDemo {

    public static void main(String[] args) {
        System.out.println("=== JAVA REFERENCE DEMONSTRATION (Pointer-like Concepts) ===\n");

        // 1. Object References (similar to pointers)
        System.out.println("1. OBJECT REFERENCES:");
        objectReferences();

        // 2. Reference Assignment and Aliasing
        System.out.println("2. REFERENCE ASSIGNMENT AND ALIASING:");
        referenceAliasing();

        // 3. Null References
        System.out.println("3. NULL REFERENCES:");
        nullReferences();

        // 4. Method Parameter Passing
        System.out.println("4. METHOD PARAMETER PASSING:");
        methodParameterPassing();

        // 5. Array References
        System.out.println("5. ARRAY REFERENCES:");
        arrayReferences();

        // 6. Reference Chains (like pointer to pointer)
        System.out.println("6. REFERENCE CHAINS:");
        referenceChains();

        // 7. Linked List Implementation
        System.out.println("7. LINKED LIST (Node References):");
        linkedListDemo();

        // 8. Wrapper Classes for Primitive Types
        System.out.println("8. WRAPPER CLASSES (Reference Behavior):");
        wrapperClasses();
    }

    // 1. Basic object references
    public static void objectReferences() {
        // Creating objects and references
        Student student1 = new Student("John", 20);
        Student student2 = new Student("Alice", 22);

        System.out.println("student1: " + student1);
        System.out.println("student2: " + student2);

        // Reference comparison vs content comparison
        System.out.println("student1 == student2: " + (student1 == student2)); // Reference comparison
        System.out.println("student1.equals(student2): " + student1.equals(student2)); // Content comparison

        // Hash codes (memory addresses in Java)
        System.out.println("student1 hash code: " + System.identityHashCode(student1));
        System.out.println("student2 hash code: " + System.identityHashCode(student2));
        System.out.println();
    }

    // 2. Reference aliasing (multiple references to same object)
    public static void referenceAliasing() {
        Student original = new Student("Bob", 25);
        Student alias = original; // Both references point to same object

        System.out.println("Original: " + original);
        System.out.println("Alias: " + alias);
        System.out.println("Are they the same object? " + (original == alias));

        // Modifying through alias affects original
        alias.name = "Robert";
        alias.age = 26;

        System.out.println("After modifying through alias:");
        System.out.println("Original: " + original);
        System.out.println("Alias: " + alias);
        System.out.println();
    }

    // 3. Null references
    public static void nullReferences() {
        Student student = null;
        System.out.println("Null reference: " + student);

        // Safe null checking
        if (student == null) {
            System.out.println("Reference is null - cannot access object methods");
        }

        // Initializing the reference
        student = new Student("Charlie", 23);
        System.out.println("After initialization: " + student);

        // Setting back to null
        student = null;
        System.out.println("After setting to null: " + student);
        System.out.println();
    }

    // 4. Method parameter passing (pass by reference for objects)
    public static void methodParameterPassing() {
        Student student = new Student("Diana", 21);
        IntWrapper number = new IntWrapper(100);

        System.out.println("Before method calls:");
        System.out.println("Student: " + student);
        System.out.println("Number: " + number);

        // Passing object references to methods
        modifyStudent(student);
        modifyNumber(number);
        reassignStudent(student); // This won't affect original reference

        System.out.println("After method calls:");
        System.out.println("Student: " + student);
        System.out.println("Number: " + number);
        System.out.println();
    }

    public static void modifyStudent(Student s) {
        s.name = "Diana Modified";
        s.age = 22;
    }

    public static void modifyNumber(IntWrapper n) {
        n.value = 200;
    }

    public static void reassignStudent(Student s) {
        s = new Student("New Student", 30); // Only local reference changes
    }

    // 5. Array references
    public static void arrayReferences() {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = array1; // Reference to same array

        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        System.out.println("Same array? " + (array1 == array2));

        // Modifying through array2 affects array1
        array2[0] = 100;
        System.out.println("After modifying array2[0]:");
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));

        // Creating a new array reference
        array2 = new int[] { 10, 20, 30 };
        System.out.println("After creating new array for array2:");
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        System.out.println("Same array? " + (array1 == array2));
        System.out.println();
    }

    // 6. Reference chains (similar to pointer to pointer)
    public static void referenceChains() {
        // Creating a chain of references
        IntWrapper wrapper1 = new IntWrapper(50);
        IntWrapper[] wrapperArray = { wrapper1 }; // Array holding reference

        System.out.println("Original value: " + wrapper1.value);
        System.out.println("Value through array: " + wrapperArray[0].value);

        // Modifying through the chain
        wrapperArray[0].value = 75;
        System.out.println("After modification through array:");
        System.out.println("Original value: " + wrapper1.value);
        System.out.println("Value through array: " + wrapperArray[0].value);

        // Breaking the chain
        wrapperArray[0] = new IntWrapper(100);
        System.out.println("After reassigning array element:");
        System.out.println("Original value: " + wrapper1.value);
        System.out.println("Value through array: " + wrapperArray[0].value);
        System.out.println();
    }

    // 7. Linked list implementation (using node references)
    public static void linkedListDemo() {
        // Creating linked list nodes
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Linked List traversal:");
        printLinkedList(head);

        // Inserting at beginning
        Node newHead = new Node(5);
        newHead.next = head;
        head = newHead;

        System.out.println("After inserting 5 at beginning:");
        printLinkedList(head);

        // Inserting in middle
        Node newNode = new Node(25);
        newNode.next = head.next.next.next; // Point to node with data 30
        head.next.next.next = newNode; // Point previous node to new node

        System.out.println("After inserting 25 in middle:");
        printLinkedList(head);
        System.out.println();
    }

    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    // 8. Wrapper classes demonstrating reference behavior
    public static void wrapperClasses() {
        // Integer objects (references)
        Integer int1 = new Integer(100);
        Integer int2 = new Integer(100);
        Integer int3 = int1;

        System.out.println("int1: " + int1);
        System.out.println("int2: " + int2);
        System.out.println("int3: " + int3);

        System.out.println("int1 == int2: " + (int1 == int2)); // Different objects
        System.out.println("int1 == int3: " + (int1 == int3)); // Same object
        System.out.println("int1.equals(int2): " + int1.equals(int2)); // Same value

        // Autoboxing and reference behavior
        Integer boxed1 = 127; // Cached
        Integer boxed2 = 127; // Same cached object
        Integer boxed3 = 128; // New object
        Integer boxed4 = 128; // Another new object

        System.out.println("Autoboxing with small integers (cached):");
        System.out.println("boxed1 == boxed2: " + (boxed1 == boxed2)); // true (cached)
        System.out.println("boxed3 == boxed4: " + (boxed3 == boxed4)); // false (not cached)

        // String references
        String str1 = "Hello";
        String str2 = "Hello"; // String pool reference
        String str3 = new String("Hello"); // New object

        System.out.println("String references:");
        System.out.println("str1 == str2: " + (str1 == str2)); // true (string pool)
        System.out.println("str1 == str3: " + (str1 == str3)); // false (different objects)
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true (same content)
    }
}