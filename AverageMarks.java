// Create AverageMarks class to calculate the average marks of Sam in PCM
class AverageMarks{
	public static void main(String[] args){
		// Create a variable mathMarks to store Marks in Maths out of 100
		int mathsMarks = 94;

		// Create a variable physicsMarks to store Marks in Physics out of 100
		int physicsMarks = 95;

		// Create a variable chemistryMarks to store Marks in Chemsitry out of 100
		int chemistryMarks = 96;

		// Calculate the average marks of three subjects out of 100
		int averageMarks = ( mathsMarks + physicsMarks + chemistryMarks ) / 3;

		// Display the resut
		System.out.print("Sam's average marks in PCM is " + averageMarks);
	}
}
