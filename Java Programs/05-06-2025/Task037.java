
class Employee {
    private int pwd;
    protected int Salary;
    public int empid;

    Employee() {
        // Default constructor
    }
}

class Hr extends Employee {
    Hr() {
        // super.pwd = 1254; // Error: Cannot access private member of superclass
        super.Salary = 50000; // OK: Salary is protected
        super.empid = 10001;  // OK: empid is public
    }

    public static void main(String[] args) {
        Hr hr = new Hr();
        // System.out.println(hr.pwd); // Not accessible
        System.out.println("Salary: " + hr.Salary);
        System.out.println("EmpID: " + hr.empid);
    }
}


