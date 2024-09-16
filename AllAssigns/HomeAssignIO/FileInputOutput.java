package HomeAssignIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileInputOutput {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("eg.txt"))) {
            String line;
           int ln=1;
            // Read the file line by line
            while ((line = reader.readLine()) != null) {
               // System.out.println(line); // Print each line to the console
                System.out.println("Line" + ln +line);
                ln=ln+1;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

