import java.io.*;
import java.util.*;

public class SchoolResult {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("students.txt"));

            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("report.txt", true)); 

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(" ");

                String name = data[0];

                int total = 0;
                for (int i = 1; i < data.length; i++) {
                    total += Integer.parseInt(data[i]);
                }

                double avg = (double) total / (data.length - 1);

                bw.write("Student: " + name +
                        " Average: " + avg);
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("Report Generated Successfully");

        } catch (FileNotFoundException e) {
            System.out.println("Input file not found!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}