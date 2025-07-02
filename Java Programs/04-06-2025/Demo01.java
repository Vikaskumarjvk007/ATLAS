public class Demo01 {

    public static void main(String[] args) {
        char[] arr = {'a','e','i','o','u'};
        System.out.println(arr); // Output: aeiou

        String[] names = {"Meena", "Tina", "Veena", "heena"};
        System.out.println(names[0]); // Output: Meena
        names[1] = "Reena";
        System.out.println(names[1]); // Output: Reena
        System.out.println(names.length); // Output: 4

        // Try to access 5th index (index 4, valid)
        System.out.println(names[3]); // Output: heena

        System.out.println(arr[5]);