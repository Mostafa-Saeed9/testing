import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args)  {


        String url = "http://liveexample.pearsoncmg.com/data/Scores.txt";
        String filename = "scores.txt";

        try {
            // Open a connection to the URL
            URL scoresUrl = new URL(url);
            BufferedReader reader = new BufferedReader(new InputStreamReader(scoresUrl.openStream()));

            // Read the scores and store them in a file
            String line1 = reader.readLine();
            String line2 = reader.readLine();

            reader.close();
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            writer.write(line1+" "+line2 );
            writer.close();
  
            System.out.println("Scores downloaded and stored in " + filename);
        } catch (IOException e) {
            System.out.println("Error downloading scores: " + e.getMessage());
        }

        try {
            System.out.println("sum of scores in the file = "+getSum(filename));
            System.out.println("the average of scores in the file = "+getAverage(filename));
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static int getSum(String file) throws FileNotFoundException{

        Scanner scanner = new Scanner(new File(file));
        int sum = 0;
        while (scanner.hasNextInt()) {
           // int score = scanner.nextInt();
            sum += scanner.nextInt();
        }
        scanner.close();
        return sum;
    }
    public static int getAverage(String file) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(file));
        int count=0;
        int sum =0;
        while (scanner.hasNextInt()){
            sum+= scanner.nextInt();
            count++;
        }
        scanner.close();
        return sum/count;
    }
}
