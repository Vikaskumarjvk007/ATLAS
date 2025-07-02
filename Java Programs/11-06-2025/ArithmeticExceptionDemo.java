// Task: Demonstrate ArithmeticException (Unchecked Exception) in Java
public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        int n = 10;
        int m = 0;

        try {
            // This line will throw ArithmeticException: / by zero
            int ans = n / m;
            System.out.println("Answer: " + ans);
        } catch (ArithmeticException e) {
            // Handling the exception
            System.out.println("Error: Division by zero is not allowed!");
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Program continues after handling the exception.");
        }
    }
}

/*
Explanation:
- When you try to divide an integer by zero, Java throws an ArithmeticException at runtime.
- This is an unchecked exception (a type of RuntimeException), so it is not checked at compile time.
- The catch block handles the exception and prints an error message.
- The finally block always executes, showing that the program continues.
*/
