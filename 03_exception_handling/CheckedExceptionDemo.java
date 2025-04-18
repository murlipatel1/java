import java.io.*;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("missingfile.txt"); // May throw FileNotFoundException
            System.out.println("File opened successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        } finally {
            System.out.println("This block always runs (even if exception occurs).");
        }
    }
}
