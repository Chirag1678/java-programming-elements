// Create SquareSideCalculator class to find the side length of a square
import java.util.Scanner; // Import Scanner class to take user input

class SquareSideCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input from the keyboard
        Scanner input = new Scanner(System.in);

        // Declare a variable for the perimeter
        double perimeter;

        // Take user input for the perimeter
        System.out.print("Enter the perimeter of the square: ");
        perimeter = input.nextDouble();

        // Calculate the side length using the formula: side = perimeter / 4
        double side = perimeter / 4;

        // Display the result
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f\n", side, perimeter);

        // Close the scanner
        input.close();
    }
}
