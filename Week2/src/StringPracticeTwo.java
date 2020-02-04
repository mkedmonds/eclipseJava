import java.util.Scanner;

public class StringPracticeTwo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		
		String first = in.nextLine();
		
		System.out.println("Enter your middle name: ");
		
		String mid = in.nextLine();
		
		System.out.println("Enter your last name: ");
		
		String last = in.nextLine();
		
		first = first.toUpperCase();
		mid = mid.toUpperCase();
		last = last.toUpperCase();
		
		System.out.print(first.charAt(0));
		System.out.print(mid.charAt(0));
		System.out.print(last.charAt(0));
	}
}
