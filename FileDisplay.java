
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDisplay {
    public static void main(String[] args) {
        String filePath = "C:/Users/ROL.24_ICT_MU/Desktop/h.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                System.out.println(lineNumber++ + ": " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
