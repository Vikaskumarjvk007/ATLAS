public class NameArray {
    public static void main(String[] args) {
        char[] Name = {'V', 'i', 'k', 'a', 's', ' ', 'K', 'u', 'm', 'a', 'r'};
        System.out.println(Name); // prints the name as a string

        int n = Name.length;
        System.out.println("There are " + n + " letters in my name");

        // traversing array
        for (int i = 0; i < n; i++) {
            System.out.print(Name[i] + " ");
        }
        System.out.println(); // for a new line after the loop
    }
}
