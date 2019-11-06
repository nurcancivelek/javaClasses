package com.class8;

import java.util.Scanner;

public class WhileExTilda {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
        boolean israin;
        do {
            System.out.println("is it raining?");
            israin = scan.nextBoolean();
            if (israin) {System.out.println("Please take an umbrella");}
        } while (israin);
        System.out.println("go to the park");
	}

}
