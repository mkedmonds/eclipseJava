import java.util.Scanner;

//Madeline Edmonds

public class WeatherCheckEdmonds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String spring = "spring";
		String summer = "summer";
		String fall = "fall" ;
		String winter = "winter" ; 
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter in a Season: ");
		
		String season = in.nextLine();
		
		System.out.println("Season = " + season);
		
		System.out.println("Please enter in a temperature: ");
		
		int temperature = in.nextInt();
		
		System.out.println("Tempurature = " + temperature);
		
		if(season.equalsIgnoreCase(spring) && temperature > 60) {
			System.out.println("No jacket needed");
		}
		else if(season.equalsIgnoreCase(summer) && temperature > 90) {
			System.out.println("Drink lots of water");
		}
		else if(season.equalsIgnoreCase(fall) && temperature > 50) {
			System.out.println("Enjoy the leaves");
		}
		else if(season.equalsIgnoreCase(winter) && temperature <10) {
			System.out.println("Brr... Bundle Up");
		}
		else {
			System.out.println("No Advice from me");
		}

	}

}
