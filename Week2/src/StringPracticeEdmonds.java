import java.util.Scanner;

//Madeline Edmonds

public class StringPracticeEdmonds {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a name: ");
		
		String nameOne = in.nextLine();	
		
		
		System.out.println(nameOne.charAt(0) + " " + nameOne.charAt(nameOne.length()-1) + " " + nameOne.substring(1, nameOne.length() - 1));
		
		in.close();
	}
}
