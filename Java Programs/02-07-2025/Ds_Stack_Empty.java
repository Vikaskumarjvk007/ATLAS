import java.util.Stack;

public class Ds_Stack_Empty {
	public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        System.out.println("Is the stack empty? " + names.empty()); 
    
        names.push("Prasunamba");
        names.push("Meher");

        System.out.println("Is the stack empty? " + names.empty());

        while (!names.empty()){
            System.out.println("Popped: " + names.pop());
        }

        System.out.println("Is the stack empty? " + names.empty());
	}
}
