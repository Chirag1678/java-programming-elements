// Create PurchaseCalculator class to calculate total price of items
import java.util.Scanner; // Import Scanner class to take user input

class PurchaseCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input from the keyboard
        Scanner input = new Scanner(System.in);

        // Declare variables for unit price and quantity
        double unitPrice;
        int quantity;

        // Take user input for unit price
        System.out.print("Enter the unit price of the item (INR): ");
        unitPrice = input.nextDouble();

        // Take user input for quantity
        System.out.print("Enter the quantity to be bought: ");
        quantity = input.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Display the result
        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and unit price is INR %.2f\n", 
                           totalPrice, quantity, unitPrice);

        // Close the scanner
        input.close();
    }
}
