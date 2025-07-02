public class PersonDemo {
    public static void main(String[] args) {
        // Creating an object using the parameterized constructor
        Person person1 = new Person("Alice");

        // Using the getter method to retrieve and print the name
        System.out.println("Person 1's name: " + person1.getName());

        // Creating another Person object using the default constructor
        Person person2 = new Person();
        person2.setName("Bob");
        System.out.println("Person 2's name: " + person2.getName());
    }
}