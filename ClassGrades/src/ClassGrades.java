import java.util.Scanner;
public class ClassGrades {

	public static void main(String[] args) {
	 try (Scanner scnr = new Scanner(System.in)) {
		float classGrade =0;
	 	float gradeSumtotal =0;
	 	
	 		System.out.println("What grade did you get in your assignment?");
	 			for (int i =0; i<10; i++){
		          classGrade =scnr.nextFloat();
		          gradeSumtotal += classGrade;
		       }
		       
		       System.out.println("Average: " + (gradeSumtotal / 10));
	 }
		    }
		 } 
