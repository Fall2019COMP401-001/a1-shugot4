package a1;

import java.util.Scanner;

public class A1Adept {

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
		
		// output code
		
		// create a item and price log
		numberOfItemsInStore = scan.nextInt();
		String itemList[] = new String[numberOfItemsInStore];
		double priceList[] = new double[numberOfItemsInStore];
		for (int i = 0; i < numberOfItemsInStore; i++) {
			itemList[i] = scan.next();
			priceList[i]= scan.nextDouble();
//			System.out.println(itemList[i]);
//			System.out.println(priceList[i]);
		}
		
		// declare more variables mostly arrays
		numberOfCustomers = scan.nextInt();
		
		String customerFirstName[] = new String[numberOfCustomers];
		String customerLastName[] = new String[numberOfCustomers];
		double totalPriceA[] = new double[numberOfCustomers];
		double totalPriceC[] = new double[numberOfCustomers];
		String maxFName = "";
		String maxLName = "";
		String minFName = "";
		String minLName = "";
		double maxPrice = 0;
 		// associates customer first name last name and other information to same index on different arrays
		for (int o = 0; o < numberOfCustomers; o++) {
				customerFirstName[o] = scan.next();
				customerLastName[o] = scan.next();
				numberOfItemsBought = scan.nextInt();
				String typeFood[] = new String[numberOfItemsBought];
				int numberFood[] = new int[numberOfItemsBought];
				// inputs type of food and number of each food that the customer purchased
				for (int p = 0; p < numberOfItemsBought; p++) {
					numberFood[p] = scan.nextInt();
					typeFood[p] = scan.next();
				}
				// checks the item with the item list so that we can get the total price for the item
				for (int a = 0; a < numberOfItemsBought; a++) {
					for (int b = 0; b < itemList.length; b++) {
						if (typeFood[a].compareTo(itemList[b]) == 0) {
							totalPriceC[a] = numberFood[a] * priceList[b];
//							System.out.println(totalPriceC[a]);
							break;
						}
					}		
				}

				// sums up all the prices for the customer and puts it into an array that contains the total price for all customers
				for (int c = 0; c < numberOfItemsBought; c++) {
					totalPriceA[o] += totalPriceC[c];
//					System.out.println(totalPriceA[o]);
				}
				// need to add totalPriceC to get the total price for first customer.
				// then I need to find max of all payment prices then print output
			}
			
			// finds max price
			for (int d = 0; d < numberOfCustomers; d++) {
//				if (d + 1 == numberOfCustomers) {
//					break;
//				}
				if (totalPriceA[d] > maxPrice) {
					maxPrice = totalPriceA[d];
					maxFName = customerFirstName[d];
					maxLName = customerLastName[d];
				}
//				if (totalPriceA[d] < maxPrice) {
//					maxPrice = totalPriceA[d + 1];
//					maxFName = customerFirstName[d + 1];
//					maxLName = customerLastName[d + 1];
//				}
			}
			
			double minPrice = Integer.MAX_VALUE;
			//System.out.println(numberOfCustomers);
			for (int f = 0; f < numberOfCustomers; f++) {
//				if (f + 1 == numberOfCustomers) {
//					break;
//				}
				//System.out.println(totalPriceA[f]);
				if (totalPriceA[f] < minPrice) {
					minPrice = totalPriceA[f];
					minFName = customerFirstName[f];
					minLName = customerLastName[f];
				}
//				if (totalPriceA[f] > maxPrice) {
//					minPrice = totalPriceA[f + 1];
//					minFName= customerFirstName[f + 1];
//					minLName = customerLastName[f + 1];
//				}
			}
			double averagePrice = 0.0;
			for (int y = 0; y < numberOfCustomers; y++) {
				averagePrice += totalPriceA[y];
			}
			averagePrice = averagePrice / numberOfCustomers;
			String a = String.format("%.2f", maxPrice);
			System.out.println("Biggest: " + maxFName + " " + maxLName +" (" + a + ")");
			String x = String.format("%.2f", minPrice);
			System.out.println("Smallest: " + minFName + " " + minLName +" (" + x + ")");
			String z = String.format("%.2f", averagePrice);
			System.out.println("Average: " + z);
		}
	};

