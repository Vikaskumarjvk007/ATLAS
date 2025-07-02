import java.util.Stack;
class Ds_Stack_Peek  {
    public static void main(String[] args) {
        Stack<String> names= new Stack<>();

        names.push("Prasunamba");
        names.push("Meher");
        names.push(".MK");

        System.out.println("Stack of names: " + names);

        String topElement = names.peek();
        System.out.println("The top element (without removal); "+ topElement);

        System.out.println("Stack of names after peek operation " + names);
    }
}
