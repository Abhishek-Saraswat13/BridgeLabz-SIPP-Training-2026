import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input client's weight in kilograms
        System.out.print("Enter weight (kg): ");
        double weight = scanner.nextDouble();

        // Input client's height in meters
        System.out.print("Enter height (m): ");
        double height = scanner.nextDouble();

        // Calculate BMI using the formula
        double bmi = weight / (height * height);

        // Display BMI
        System.out.printf("BMI = %.2f%n", bmi);

        // Determine BMI category using if-else
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } 
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Category: Normal");
        } 
        else {
            System.out.println("Category: Overweight");
        }

        // Close scanner
        scanner.close();
    }
}