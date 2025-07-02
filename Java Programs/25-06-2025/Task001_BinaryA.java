public class Task001_BinaryA {
    public static void main(String[] args) {
        char A = 'A';
        int ascii = (int) A;
        String binary8 = String.format("%8s", Integer.toBinaryString(ascii)).replace(' ', '0');
        String binary16 = String.format("%16s", Integer.toBinaryString(ascii)).replace(' ', '0');
        System.out.println("8-bit binary of 'A': " + binary8);
        System.out.println("16-bit binary of 'A': " + binary16);
    }
}
