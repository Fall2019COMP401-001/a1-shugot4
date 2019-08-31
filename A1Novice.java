package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int customer = 0;
		String firstName = "";
		String lastName = "";
		int numberOfItemsBought = 0;
		int specificAmount = 0;
		String nameOfItem = "";
		Double price = 0.0;
		Double totalPrice = 0.0; 
		
		//see amount of customer
		customer = scan.nextInt();
		
		for (int i = 0; i < customer; i++) {
			firstName = scan.next();
			lastName = scan.next();
			numberOfItemsBought = scan.nextInt();
			
			for (int n = 0; n < numberOfItemsBought; n++) {
				specificAmount = scan.nextInt();
				nameOfItem = scan.next();
				price = scan.nextDouble();
				totalPrice += price * specificAmount;
			}
			String a = String.format("%.2f", totalPrice);
			System.out.println(firstName.substring(0,1) + "." + " " + lastName + ":" + " " + a);
			totalPrice = 0.0;
		}
		
}
}
