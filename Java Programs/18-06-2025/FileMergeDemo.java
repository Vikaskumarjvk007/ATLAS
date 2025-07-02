import java.io.*;
import java.util.*;

public class FileMergeDemo {
    public static void main(String args[]) {
        try {
            FileInputStream file1 = new FileInputStream("File1.txt");
            FileInputStream file2 = new FileInputStream("File2.txt");
            SequenceInputStream file3 = new SequenceInputStream(file1, file2);
            BufferedInputStream br1 = new BufferedInputStream(file3);
            BufferedOutputStream br2 = new BufferedOutputStream(new FileOutputStream("MergedFile.txt"));
            int ch;
            while ((ch = br1.read()) != -1) {
                br2.write(ch);
            }
            br1.close();
            br2.close();
            file1.close();
            file2.close();
            System.out.println("Merge Two File Successfully");
        } catch (IOException e) {
            System.out.println("Sorry..!! File Not Found...!!!");
        }
    }
}
