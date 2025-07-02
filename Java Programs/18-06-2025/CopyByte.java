import java.io.*;

public class CopyByte {
    public static void main(String args[]) {
        try {
            FileInputStream infile = new FileInputStream("NewFile01.txt");
            FileOutputStream outfile = new FileOutputStream("NewFile05.txt");
            int byteread;
            while ((byteread = infile.read()) != -1) {
                outfile.write(byteread);
            }
            infile.close();
            outfile.close();
            System.out.println("Byte Copied From NewFile01.txt to NewFile05.txt File");
        } catch (FileNotFoundException e) {
            System.out.println("Sorry..!! File Not Found...!!!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
