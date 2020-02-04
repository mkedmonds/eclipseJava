//Madeline Edmonds

import java.util.Scanner;

public class CompareNumbersEdmonds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		
		double numberOne = in.nextDouble();
		
		System.out.println("Please enter another number: ");
		
		double numberTwo = in.nextDouble();
		
		boolean equalNums = numberOne == numberTwo;
		
		boolean greaterThan = numberOne > numberTwo;
		
		boolean lessThan = numberOne < numberTwo;
		
		System.out.println(numberOne + " and " + numberTwo + " are equal: " + equalNums);
		
		System.out.println(numberOne + " is greater than " + numberTwo + ": " + greaterThan);
		
		System.out.println(numberOne + " is less than " + numberTwo + ": " + lessThan);
		
		in.close();

	}

}
