// Create ConvertToMile class to convert distanc in kilometers to miles
class ConvertToMiles{
	public static void main(String[] args){
		// Create a variable distanceInKms to store the given distance in Kms
		float distanceInKms = (float)10.8;

		// Convert the distance into miles by using the formula: 1 Km = 1.6 miles
		float distanceInMiles = distanceInKms * (float)1.6;

		// Display the result in miles
		System.out.print("The distance " + distanceInKms + " km in miles is " + distanceInMiles);
	}
}
