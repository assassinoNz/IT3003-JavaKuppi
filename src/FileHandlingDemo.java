import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingDemo {
    public static void main(String[] args) {
        FileReader reader = null;
        FileWriter writer = null;

        try {
            reader = new FileReader("input.txt");
            writer = new FileWriter("output.txt");

            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println("Input file not found");
        } catch (IOException ioe) {
            System.err.println("Output file cannot be written");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }

                if (writer != null) {
                    writer.close();
                }
            } catch(IOException ioe) {
                System.err.println("Error while closing stream");
            }
        }
    }
}
