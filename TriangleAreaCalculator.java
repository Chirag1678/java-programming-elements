// Create TriangleAreaCalculator class to calculate the area of a triangle
import java.util.Scanner; // Import Scanner class to take user input

class TriangleAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input from the keyboard
        Scanner input = new Scanner(System.in);

        // Declare variables for base and height
        double base, height;

        // Take user input for base
        System.out.print("Enter the base of the triangle (in cm): ");
        base = input.nextDouble();

        // Take user input for height
        System.out.print("Enter the height of the triangle (in cm): ");
        height = input.nextDouble();

        // Calculate the area in square centimeters
        double areaCm = 0.5 * base * height;

        // Convert area from square centimeters to square inches (1 cm² = 0.1550 in²)
        double areaInches = areaCm * 0.1550;

        // Display the results
        System.out.printf("The area of the triangle in square centimeters is %.2f cm² and in square inches is %.2f in²\n", 
                          areaCm, areaInches);

        // Close the scanner
        input.close();
    }
}
