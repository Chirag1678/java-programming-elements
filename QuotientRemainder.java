// Create QuotientRemainder class to compute quotient and remainder
import java.util.Scanner; // Import Scanner class to take user input

class QuotientRemainder {
    public static void main(String[] args) {
        // Create a Scanner object to take user input from the keyboard
        Scanner input = new Scanner(System.in);

        // Declare variables for two numbers
        int firstNumber, secondNumber;

        // Take user input for the first number
        System.out.print("Enter the first number: ");
        firstNumber = input.nextInt();

        // Take user input for the second number
        System.out.print("Enter the second number: ");
        secondNumber = input.nextInt();

        // Calculate quotient and remainder
        int quotient = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;

        // Display the result
        System.out.printf("The Quotient is %d and Remainder is %d of two numbers %d and %d", 
                          quotient, remainder, firstNumber, secondNumber);

        // Close the scanner
        input.close();
    }
}
