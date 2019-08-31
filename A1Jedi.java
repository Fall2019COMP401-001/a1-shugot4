package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int numberOfItemsInStore = 0;
		String itemName = "";
		double itemPrice = 0;
		int numberOfCustomers = 0;
		String firstName = "";
		String lastName = "";
		int numberOfItemsBought = 0;
		int quantityOfItem = 0;
		String customerItemName = "";
		numberOfItemsInStore = scan.nextInt();
		int itemCount[] = new int[numberOfItemsInStore];
		int customerCount[] = new int[numberOfItemsInStore];
		
		//System.out.println(itemCount);
		
		// output code
		
		// create a item and price log
		
		String itemList[] = new String[numberOfItemsInStore];
		double priceList[] = new double[numberOfItemsInStore];
		for (int i = 0; i < numberOfItemsInStore; i++) {
			itemList[i] = scan.next();
			priceList[i]= scan.nextDouble();
		}
		numberOfCustomers = scan.nextInt();
		//System.out.println(itemCount);
//		for (int h = 0; h < numberOfItemsInStore; h++) {
//			itemCount[h] += 0;
//		}
		for (int i = 0; i < numberOfCustomers; i++) {
			scan.next();
			scan.next();
			int a = scan.nextInt();
			for (int p = 0; p < a; p++) {
				int b = scan.nextInt();
				String c = scan.next();
				for (int s = 0; s < numberOfItemsInStore; s++) {
					if (c.compareTo(itemList[s]) == 0) {
						itemCount[s] += b;
						customerCount[s] += 1;
					}
				}
			}
		}
		//System.out.println(itemCount[1]);
		for ( int e = 0; e < numberOfItemsInStore; e++) {
			if (itemCount[e] < 1) {
				System.out.println("No customers bought " + itemList[e]);
				continue;
			}
			System.out.println(customerCount[e] + " customers bought " + itemCount[e] + " " + itemList[e]);
		}
	}
}
