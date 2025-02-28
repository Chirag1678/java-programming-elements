// Create HeightConverter class to convert height from cm to feet and inches
import java.util.Scanner; // Import Scanner class to take user input

class HeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take user input from the keyboard
        Scanner input = new Scanner(System.in);

        // Create a variable to store height in centimeters
        double heightInCm;

        // Take user input for height in cm
        System.out.print("Enter your height in centimeters: ");
        heightInCm = input.nextDouble();

        // Convert cm to inches (1 inch = 2.54 cm)
        double totalInches = heightInCm / 2.54;

        // Convert inches to feet and inches (1 foot = 12 inches)
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        // Display the result
        System.out.printf("Your height in cm is %.2f while in feet is %d and inches is %.2f\n", heightInCm, feet, inches);

        // Close the scanner
        input.close();
    }
}
