//Madeline Edmonds

import javax.swing.JOptionPane;

public class FitnessFirstEdmonds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String input = JOptionPane.showInputDialog("Enter price:"); 
		double price = Double.parseDouble(input); 
		final double TAX_RATE = 8.5; 
		price = price * (1 + TAX_RATE / 100); 
		JOptionPane.showMessageDialog(null, "Price after tax: " + price); */
		
		final int MINUTES_PER_HOUR = 60;
		
		String input = JOptionPane.showInputDialog("Please enter your member ID (MUST BE 6 CHARACTERS):");
		
		input = input.substring(0, 2).toUpperCase() + "-" + input.substring(2,5).toUpperCase() + "-" + input.substring(5).toUpperCase();
		
		//TESTING TO SEE IF ID SHOWS RIGHT JOptionPane.showMessageDialog(null, "Member ID: " + input);
		
		String inputTwo = JOptionPane.showInputDialog("Please enter your massage time in minutes:");
		
		int minutes = Integer.parseInt(inputTwo);
		
		int hours = minutes / MINUTES_PER_HOUR;
		
		int remainderMinutes = minutes % MINUTES_PER_HOUR;
		
		JOptionPane.showMessageDialog(null, "Thank you, Member " + input + " for your massage reservation for " + hours + " hours and " + remainderMinutes + " minutes." );

	}

}
