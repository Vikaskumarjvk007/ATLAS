/* File name : AbstractDemo.java */
public class AbstractDemo {

   public static void main(String [] args) {
      // The following is not allowed and would raise error:
      // Employee e = new Employee("George W.", "Houston, TX", 43);
      // Instead, create an instance of a concrete subclass:
      Employee e = new SalaryEmployee("George W.", "Houston, TX", 43);
      System.out.println("\n Call mailCheck using Employee reference--");
      e.mailCheck();
   }
}

abstract class Employee {
   private String name;
   private String address;
   private int number;

   public Employee(String name, String address, int number) {
      System.out.println("Constructing an Employee");
      this.name = name;
      this.address = address;
      this.number = number;
   }
   
   public double computePay() {
     System.out.println("Inside Employee computePay");
     return 0.0;
   }
   
   public void mailCheck() {
      System.out.println("Mailing a check to " + this.name + " " + this.address);
   }

   public String toString() {
      return name + " " + address + " " + number;
   }

   public String getName() {
      return name;
   }
 
   public String getAddress() {
      return address;
   }
   
   public void setAddress(String newAddress) {
      address = newAddress;
   }
 
   public int getNumber() {
      return number;
   }
}

// Concrete subclass of Employee
class SalaryEmployee extends Employee {
   private double weeklySalary; // Example field for salary

   public SalaryEmployee(String name, String address, int number) {
      super(name, address, number);
      this.weeklySalary = 1000.0; // Default salary for demonstration
   }

   @Override
   public double computePay() {
      System.out.println("Inside SalaryEmployee computePay");
      return weeklySalary; // Return actual salary
   }
}
