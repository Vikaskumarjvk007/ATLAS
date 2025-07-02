import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\akujvika\\Desktop\\ATLAS\\CODING_PRACTICES\\JavaPrograms\\18-06-2025\\largefile.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
