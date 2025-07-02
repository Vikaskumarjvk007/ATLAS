public class Person {
   private String name;

   // Default (no-argument) constructor
   public Person() {
       System.out.println("Person object created (default constructor).");
   }

   // Parameterized constructor
   public Person(String name) {
       this.name = name;
       System.out.println("Person object created with name: " + name + " (parameterized constructor).");
   }

   // Getter
   public String getName() {
     return name;
   }

   // Setter
   public void setName(String newName) {
     this.name = newName;
   }
}