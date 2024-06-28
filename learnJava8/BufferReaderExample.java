package learnJava8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//reading from standard input with BufferReader

public class BufferReaderExample {
    public static void main(String[] args) {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter a line of text:");
            String line = reader.readLine();
            System.out.println("You entered: " + line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
   
