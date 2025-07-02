public class StringsHandling {
    public static void main(String[] args) {
        String str1 = "Java Strings "; 
        String str2 = new String(str1);
        String str3 = new String("are easy to learn ");
        char ch[] = {'S', 't', 'r' ,'i', 'n', 'g'}; 
        String str4 = new String(ch);
        System.out.println(str1 + "\n" + str2 + "\n" + str3 + "\n" + str4);

        System.out.println("Length of str1: " + str1.length());
        System.out.println("str1 + str3: " + str1 + str3);
        System.out.println("First char of str4: " + str4.charAt(0));
    }
}