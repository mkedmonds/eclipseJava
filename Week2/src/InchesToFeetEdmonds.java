import java.util.Scanner;

//Madeline Edmonds

public class InchesToFeetEdmonds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PARTNER FOR ASSIGNMENT: ALEX
		
		//Covert inches to feet and inches from user input
		
		final int INCHES_TO_FOOT = 12;
		
		Scanner in = new Scanner(System.in);  //initializing scanner
		
		System.out.println("Please enter an inch value: "); //Asking for user input
		
		int inchValue = in.nextInt(); //pausing for user input
		
		
		//TESTING INPUT System.out.println("Inch value: " + inchValue + " inches");
		
		
		
		int footValue = inchValue / INCHES_TO_FOOT; //getting foot value from inputed inches
		
		int remainderValue = inchValue - (footValue * INCHES_TO_FOOT); //subtracting values for remainder
		
		//other option remain = inchVal % INCHES_VALUE
		
		System.out.println("You want: " + footValue + " feet and " + remainderValue + " inches"); //Print result
		
		
		
	}

}
