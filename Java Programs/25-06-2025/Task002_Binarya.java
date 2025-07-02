// program to print binary of 'a'
public class Task002_Binarya {
    public static void main(String[] args) {
        char a = 'a';
        int ascii = (int) a;
        // get 8 bit binary
        String binary8 = String.format("%8s", Integer.toBinaryString(ascii)).replace(' ', '0');
        // get 16 bit binary
        String binary16 = String.format("%16s", Integer.toBinaryString(ascii)).replace(' ', '0');
        System.out.println("8-bit binary of 'a': " + binary8);
        System.out.println("16-bit binary of 'a': " + binary16);
    }
}
