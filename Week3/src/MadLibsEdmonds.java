import java.util.Scanner;

//Madeline Edmonds


public class MadLibsEdmonds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a name: ");
		
		String name = in.nextLine();
		
		System.out.println("Enter a past tense: ");
		
		String pastTense = in.nextLine();
		
		pastTense = pastTense.substring(0).toLowerCase();
		
		System.out.println("Enter a feeling(EX. happy, sad, hungry , etc): ");
		
		String feeling = in.nextLine();
		
		feeling = feeling.substring(0).toLowerCase();
		
		System.out.println("Enter a food: ");
		
		String food = in.nextLine();
		
		food = food.substring(0).toLowerCase();
		
		System.out.println("enter a past tense: ");
		
		String verb = in.nextLine();
		
		verb = verb.substring(0).toLowerCase();
		
		System.out.println("enter a vehicle: ");
		
		String vehicle = in.nextLine();
		
		vehicle = vehicle.substring(0).toLowerCase();
		
		System.out.println("Enter a number: ");
		
		int number = in.nextInt();
		
		String extraCredit = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		
		System.out.println();
		
		System.out.println("**********************************");
		
		System.out.println();
		
		System.out.println(extraCredit + " was feeling so " + feeling + " that they " + verb + " into the " + vehicle + " and drove " + number + " miles! Once " + extraCredit + " arrived at the restaurant, they ate " + food + " and " + pastTense + " home.");

	}

}
