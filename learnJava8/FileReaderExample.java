package learnJava8;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderExample{
    public static void main(String[] args) {
        String filePath = "example.txt"; 
        BufferedReader reader = null;

        try {
            
            FileReader fileReader = new FileReader(filePath);
            reader = new BufferedReader(fileReader);

            
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

