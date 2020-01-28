
public class AverageAgeEdmonds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int johnDoe = 46;
		int mayDoe = 48;
		int maddie = 37;
		int connor = 18;
		int doug = 13;
		
		System.out.println("John's age is: " + johnDoe);
		System.out.println("May's age is: " + mayDoe);
		System.out.println("Maddie's age is: " + maddie);
		System.out.println("Conor's age is: " + connor);
		System.out.println("Doug's age is: " + doug);
		
		double avgAge = (double)(johnDoe + mayDoe + maddie + connor + doug)/5;
		
		System.out.println();
		
		System.out.println("Average Age is: " + avgAge);
		
	}

}
