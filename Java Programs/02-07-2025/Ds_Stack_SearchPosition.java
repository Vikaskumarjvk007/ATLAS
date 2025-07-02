import java.util.Stack;
class Ds_Stack_SearchPosition  {
    public static void main(String[] args) {
        Stack<String> names= new Stack<>();

        names.push("Prasunamba");
        names.push("Meher");
        names.push(".MK");

        System.out.println("Stack of names: " + names);

        String Val = "Meher";
        int position = names.search(Val); 

        System.out.println("the searched value is at position  " + position);
    }
}
