// Create DiscountCalculator class to calculate discounted fee based on user input
import java.util.Scanner; // Import Scanner class to take user input

class DiscountCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input from the keyboard
        Scanner input = new Scanner(System.in);

        // Create variables to store fee and discount percentage
        double fee, discountPercent;

        // Take user input for fee
        System.out.print("Enter the course fee in INR: ");
        fee = input.nextDouble();

        // Take user input for discount percentage
        System.out.print("Enter the discount percentage: ");
        discountPercent = input.nextDouble();

        // Calculate the discount amount
        double discount = (discountPercent / 100) * fee;

        // Calculate the final discounted fee
        double finalFee = fee - discount;

        // Display the result
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f\n", discount, finalFee);

        // Close the scanner
        input.close();
    }
}
