// Create EarthVolume class to calculate Earth's volume in km^3 and miles^3
class EarthVolume{
    public static void main(String[] args) {
        // Create a variable radiusKm to store the Earth's radius in kilometers
        double radiusInKm = 6378;

        // Conversion factor from km^3 to miles^3 (1 km = 0.621371 miles, so (0.621371)^3)
        double conversionFactor = 0.621371 * 0.621371 * 0.621371;

        // Calculate the volume of Earth using formula: (4/3) * pi * r^3
        double volumeInKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusInKm, 3);

        // Convert the volume from cubic kilometers to cubic miles
        double volumeInMiles3 = volumeInKm3 * conversionFactor;

        // Display the result
        System.out.printf("The volume of Earth in cubic kilometers is %.2f and cubic miles is %.2f\n", volumeInKm3, volumeInMiles3);
    }
}
