// Create DistanceConverter class to convert kilometers to miles
import java.util.Scanner; // Import Scanner class to take user input

class DistanceConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take user input from the keyboard
        Scanner input = new Scanner(System.in);

        // Create a variable km to store distance in kilometers
        double km;

        // Take user input for kilometers
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble(); // Read the user input as a double

        // Conversion factor: 1 mile = 1.6 km
        double miles = km / 1.6;

        // Display the result
        System.out.printf("The total miles is %.2f mile for the given %.2f km\n", miles, km);

        // Close the scanner to free resources
        input.close();
    }
}
