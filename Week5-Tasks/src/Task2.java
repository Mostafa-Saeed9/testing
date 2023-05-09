import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){

        try {
            File file = new File("Lincoln.txt");
            Scanner scanner = new Scanner(file);
            int wordCounter = 0;
            while (scanner.hasNext()) {
                scanner.next();
                wordCounter++;
            }

            System.out.println("The number of words in the file is: " + wordCounter +" words");
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

    }
}
