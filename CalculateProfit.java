// Create CalculateProfit class to calculate profit in number and percentage
class CalculateProfit{
	public static void main(String[] args){
		// Create a variable costPrice to store the cost price of item
		int costPrice = 129;

		// Create a variable sellingPrice to store the selling price of item
		int sellingPrice = 191;

		// Calculate the profit by subtracting cost price from selling price
		int profit = sellingPrice - costPrice;

		//Calculate the profit in percentage using formaula: profit / cost price * 100
		float profitPercentage = ((float) profit / costPrice ) * 100;

		// Display the result
		System.out.printf("The Cost Price is INR %d and Selling Price is INR %d\nThe Profit is INR %d and the Profit Percentage is %.2f", costPrice, sellingPrice, profit, profitPercentage); 
	}
} 
