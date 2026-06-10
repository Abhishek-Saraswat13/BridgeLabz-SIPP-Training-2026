import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter weight (kg): ");
        double weight = scanner.nextDouble();

        
        System.out.print("Enter height (m): ");
        double height = scanner.nextDouble();

        
        double bmi = weight / (height * height);

      
        System.out.printf("BMI = %.2f%n", bmi);

   
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } 
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Category: Normal");
        } 
        else {
            System.out.println("Category: Overweight");
        }

        scanner.close();
    }
}