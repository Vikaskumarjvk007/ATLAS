import java.util.Scanner;

public class RecursiveArrayCopy {
    // Recursive function to copy one array to another
    public static void copyArray(int[] src, int[] dest, int index) {
        if (index >= src.length) {
            return;
        }
        dest[index] = src[index];
        copyArray(src, dest, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] src = new int[n];
        int[] dest = new int[n];
        System.out.println("Enter the elements of the source array:");
        for (int i = 0; i < n; i++) {
            src[i] = sc.nextInt();
        }
        copyArray(src, dest, 0);
        System.out.print("Copied array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(dest[i] + " ");
        }
        System.out.println();
    }
}
