// Create IntOperation class to perform arithmetic operations with precedence
import java.util.Scanner; // Import Scanner class to take user input

class IntOperation {
    public static void main(String[] args) {
        // Create a Scanner object to take user input from the keyboard
        Scanner input = new Scanner(System.in);

        // Declare variables for three integers
        int a, b, c;

        // Take user input for a, b, and c
        System.out.print("Enter the first number (a): ");
        a = input.nextInt();

        System.out.print("Enter the second number (b): ");
        b = input.nextInt();

        System.out.print("Enter the third number (c): ");
        c = input.nextInt();

        // Perform integer operations considering operator precedence
        int result1 = a + b * c;   // Multiplication (*) has higher precedence than addition (+)
        int result2 = a * b + c;   // Multiplication (*) is evaluated first, then addition (+)
        int result3 = c + a / b;   // Division (/) is evaluated first, then addition (+)
        int result4 = a % b + c;   // Modulus (%) is evaluated first, then addition (+)

        // Display the results
        System.out.printf("The results of Int Operations are %d, %d, %d, and %d\n", 
                          result1, result2, result3, result4);

        // Close the scanner
        input.close();
    }
}
