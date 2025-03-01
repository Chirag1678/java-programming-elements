// Create DoubleOperation class to perform arithmetic operations with double values
import java.util.Scanner; // Import Scanner class to take user input

class DoubleOperation {
    public static void main(String[] args) {
        // Create a Scanner object to take user input from the keyboard
        Scanner input = new Scanner(System.in);

        // Declare variables for three double numbers
        double a, b, c;

        // Take user input for a, b, and c
        System.out.print("Enter the first number (a): ");
        a = input.nextDouble();

        System.out.print("Enter the second number (b): ");
        b = input.nextDouble();

        System.out.print("Enter the third number (c): ");
        c = input.nextDouble();

        // Perform double operations considering operator precedence
        double result1 = a + b * c;   // Multiplication (*) has higher precedence than addition (+)
        double result2 = a * b + c;   // Multiplication (*) is evaluated first, then addition (+)
        double result3 = c + a / b;   // Division (/) is evaluated first, then addition (+)
        double result4 = a % b + c;   // Modulus (%) is evaluated first, then addition (+)

        // Display the results
        System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f\n", 
                          result1, result2, result3, result4);

        // Close the scanner
        input.close();
    }
}
