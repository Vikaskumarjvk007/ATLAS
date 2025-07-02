// Simple Inheritance Java Program
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

class Employee extends Person {
    private String employeeId;
    private double salary;

    public Employee(String name, int age, String employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }
    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
    @Override
    public String toString() {
        return super.toString() + ", Employee{employeeId='" + employeeId + "', salary=" + salary + "}";
    }
}

class Manager extends Employee {
    private String department;
    private int teamSize;

    public Manager(String name, int age, String employeeId, double salary, String department, int teamSize) {
        super(name, age, employeeId, salary);
        this.department = department;
        this.teamSize = teamSize;
    }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    public int getTeamSize() { return teamSize; }
    public void setTeamSize(int teamSize) { this.teamSize = teamSize; }
    @Override
    public String toString() {
        return super.toString() + ", Manager{department='" + department + "', teamSize=" + teamSize + "}";
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        Employee employee = new Employee("Bob", 35, "E123", 50000);
        Manager manager = new Manager("Charlie", 40, "M456", 80000, "IT", 10);

        System.out.println(person);
        System.out.println(employee);
        System.out.println(manager);
    }
}
