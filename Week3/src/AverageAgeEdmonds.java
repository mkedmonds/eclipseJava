import java.util.Scanner;

//Madeline Edmonds

public class AverageAgeEdmonds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter an age for Person1: ");
		
		int person1 = in.nextInt();
				
		System.out.println("Please enter an age for Person2: ");
		
		int person2 = in.nextInt();
		
		System.out.println("Please enter an age for Person3: ");
		
		int person3 = in.nextInt();
		
		System.out.println("Please enter an age for Person4: ");
		
		int person4 = in.nextInt();
		
		System.out.println("Person1's age is: " + person1);
		System.out.println("Person2's age is: " + person2);
		System.out.println("Person3's age is: " + person3);
		System.out.println("Person4's age is: " + person4);
		
		double avgAge = (double)(person1 + person2 + person3 + person4)/4;
		
		System.out.println();
		
		System.out.println("Average Age is: " + avgAge);
		
	}

}
