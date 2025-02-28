// Create CourseFeeCalculator class to calculate discount and final fee
class CourseFeeCalculator {
    public static void main(String[] args) {
        // Create a variable fee to store the total course fee
        int fee = 125000;

        // Create a variable discountPercent to store the discount percentage
        int discountPercent = 10;

        // Calculate the discount amount using formula: (fee * discountPercent) / 100
        int discount = (fee * discountPercent) / 100;

        // Calculate the final fee after applying the discount
        int finalFee = fee - discount;

        // Display the result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
