// A Class that represents user-defined exception
class Customer extends Exception {// predefined class Exception
    public Customer(String m) { // constructor with parameters
        super(m); // parent class constructor
    }
}

// A Class that uses the above Customer
public class setText {
    public static void main(String args[]) {
        try {
            // Throw an object of user-defined exception
            throw new Customer("This is a custom exception");
        }
        catch (Customer ex) {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}

