// Create HandshakeCalculator class to calculate maximum handshakes
import java.util.Scanner; // Import Scanner class to take user input

class HandshakeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input from the keyboard
        Scanner input = new Scanner(System.in);

        // Declare a variable to store the number of students
        int numberOfStudents;

        // Take user input for number of students
        System.out.print("Enter the number of students: ");
        numberOfStudents = input.nextInt();

        // Calculate the maximum number of handshakes using the formula (n * (n - 1)) / 2
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the result
        System.out.println("The maximum number of possible handshakes among " + numberOfStudents + " students is: " + maxHandshakes);

        // Close the scanner
        input.close();
    }
}
