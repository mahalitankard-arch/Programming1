import java.util.Scanner;

public class ClassGrades {
    public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {
           // Initialize variables
        	float classGrade = 0;
            float gradeSumtotal = 0;
            float maxGrade = 0;
            float minGrade = 0;
            //Input Collection
            System.out.println("Enter 10 assignment grades (0 - 100):");

            for (int i = 0; i < 10; i++) {
                System.out.print("Grade " + (i + 1) + ": ");

                // Loop until a valid float is entered
                while (true) {
                    if (scnr.hasNextFloat()) {
                        classGrade = scnr.nextFloat();

                        // Check that valid grade range is valid, no negative values or over 100
                        if (classGrade >= 0 && classGrade <= 100) {
                            break; // Valid input received, exit the validation loop
                        } else {
                            System.out.println("Invalid range. Please enter a grade between 0 and 100:");
                        }
                    } else {
                        String badInput = scnr.next(); // Clear the invalid non-numeric token
                        System.out.println("Invalid entry ('" + badInput + "'). Please enter a numeric grade:");
                    }
                }

                // Update sum, max, and min
                gradeSumtotal += classGrade;
                if (i == 0) {
                    maxGrade = classGrade;
                    minGrade = classGrade;
                } else {
                    if (classGrade > maxGrade) {
                        maxGrade = classGrade;
                    }
                    if (classGrade < minGrade) {
                        minGrade = classGrade;
                    }
                }
            }

            System.out.println("\nAverage: " + (gradeSumtotal / 10));
            System.out.println("Maximum Grade: " + maxGrade);
            System.out.println("Minimum Grade: " + minGrade);
        }
    }
}
