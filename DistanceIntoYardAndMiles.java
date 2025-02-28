// Create DistanceIntoYardAndMiles class to convert feet to yards and miles
import java.util.Scanner; // Import Scanner class to take user input

class DistanceIntoYardAndMiles{
    public static void main(String[] args) {
        // Create a Scanner object to take user input from the keyboard
        Scanner input = new Scanner(System.in);

        // Declare a variable for distance in feet
        double distanceInFeet;

        // Take user input for distance in feet
        System.out.print("Enter the distance in feet: ");
        distanceInFeet = input.nextDouble();

        // Convert feet to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3;

        // Convert feet to miles (1 mile = 1760 yards)
        double distanceInMiles = distanceInYards / 1760;

        // Display the result
        System.out.printf("The distance in feet is %.2f, in yards is %.2f, and in miles is %.5f\n", 
                           distanceInFeet, distanceInYards, distanceInMiles);

        // Close the scanner
        input.close();
    }
}
