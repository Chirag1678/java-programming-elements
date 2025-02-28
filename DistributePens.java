// Create DistributePens class to calculate pens per student and remaining pens
class DistributePens {
    public static void main(String[] args) {
        // Create a variable totalPens to store the total number of pens
        int totalPens = 14;

        // Create a variable totalStudents to store the total number of students
        int totalStudents = 3;

        // Calculate the number of pens each student will get using division operator
        int pensPerStudent = totalPens / totalStudents;

        // Calculate the remaining non-distributed pens using modulus operator
        int remainingPens = totalPens % totalStudents;

        // Display the result
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
