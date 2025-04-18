import java.io.*;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws IOException {
        try {
            FileReader reader = new FileReader("missingfile.txt"); // May throw FileNotFoundException
            System.out.println("File opened successfully.");
            // Perform file operations here
            // For example, read from the file
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close(); // Close the reader

            reader.close(); // Close the file reader
        } catch (FileNotFoundException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        } finally {
            System.out.println("This block always runs (even if exception occurs).");
        }
    }
}
