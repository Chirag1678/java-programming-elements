// Create BasicCalculator class to perform arithmetic operations on two numbers
import java.util.Scanner; // Import Scanner class to take user input

class BasicCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input from the keyboard
        Scanner input = new Scanner(System.in);

        // Declare variables to store two floating-point numbers
        double number1, number2;

        // Take user input for number1
        System.out.print("Enter the first number: ");
        number1 = input.nextDouble();

        // Take user input for number2
        System.out.print("Enter the second number: ");
        number2 = input.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number2 != 0 ? number1 / number2 : Double.POSITIVE_INFINITY; // Prevent division by zero

        // Display the results
        System.out.printf("The addition, subtraction, multiplication, and division value of two numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f\n", 
                          number1, number2, addition, subtraction, multiplication, division);

        // Close the scanner
        input.close();
    }
}
