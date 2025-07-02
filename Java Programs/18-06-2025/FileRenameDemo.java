import java.io.*;

public class FileRenameDemo {
    public static void main(String args[]) {
        if (args.length < 2) {
            System.out.println("Please provide old and new filenames as arguments.");
            return;
        }
        File f1 = new File(args[0]);
        File f2 = new File(args[1]);
        if (f1.renameTo(f2)) {
            System.out.println("Rename File " + f1 + " To " + f2 + " Successfully");
        } else {
            System.out.println("Rename operation failed.");
        }
    }
}
