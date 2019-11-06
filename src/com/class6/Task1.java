package com.class6;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		
		/*ask user to enter boolean value for sale
		* if no sale --> I am not shopping
		* if sale --> check the price of the item
		* based on the amount we will have to calculate the price after discount
		* if price < 20 --> apply 10%
		* if price between 20-100 --> 20%
		* if between 100-500--> 30 %
		* anything --> 50 %
		* 
		* After discount ___ the price of the item reduce from __ to ___
		*/
				
		Scanner scan=new Scanner(System.in);
		System.out.println("is there a sale?");
		boolean sale=scan.nextBoolean();	
		
		if(sale) {
			System.out.println("how much?");
			double price = scan.nextDouble();
			double oPrice = price;
			if(price<20) {
				price= price - (price * 0.1);
			} else if(price>=20 && price<100) {
				price= price - (price * 0.2);
			}else if(price>=100 && price<500) {
				price= price - (price * 0.3);
			}else if(price>500)  {
				price= price - (price * 0.5);
			}
			System.out.println("After discount "+ oPrice+ " reduced to " + price);
		}else {
			System.out.println("i am not shopping");
		}
	}
}
