
//Madeline Edmonds

public class BookOrderEdmonds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int booksOrdered = 8;
		double bookSubtotal = 125.37;
		final double TAX = .055;
		final double SHIPPING_COST = 1.5;
				
		System.out.println("BOOK ORDER");
		
		System.out.println();
		
		System.out.println("Number of books ordered: " + booksOrdered);
		
		System.out.println("Book Subtotal: " + bookSubtotal);
		
		double salesTax = bookSubtotal * TAX;
		
		System.out.println("Tax: " + salesTax);
		
		double shipping = booksOrdered * SHIPPING_COST;
		
		System.out.println("Shipping cost: " + shipping);
		
		double totalPrice = bookSubtotal + salesTax + shipping;
		
		System.out.println();
		
		System.out.println("Total: $" + totalPrice);

	}

}
