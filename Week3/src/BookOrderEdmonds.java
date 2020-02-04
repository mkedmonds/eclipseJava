import java.util.Scanner;

//Madeline Edmonds

public class BookOrderEdmonds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		final double TAX = .055;
		final double SHIPPING_COST = 1.5;
			
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Please enter number of books ordered: ");
		
		int booksOrdered = in.nextInt();
		
		System.out.println("Pleas enter the book Subtotal: ");
		
		double bookSubtotal = in.nextDouble();
		
		double salesTax = bookSubtotal * TAX;
		
		System.out.println();
		
		System.out.println("BOOK ORDER");
		
		System.out.println();
		
		System.out.println("Number of books ordered: " + booksOrdered);
		
		System.out.printf("Books Subtotal: $%.2f" , bookSubtotal);
		
		System.out.println();
		
		System.out.printf("Tax: $%.2f" , salesTax);
		
		System.out.println();
		
		double shipping = booksOrdered * SHIPPING_COST;
		
		System.out.printf("Shipping cost: $%.2f" , shipping);
		
		double totalPrice = bookSubtotal + salesTax + shipping;
		
		System.out.println();
		
		System.out.printf("Total: $%.2f" , totalPrice);

	}

}
