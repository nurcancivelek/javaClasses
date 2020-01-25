package com.class33;

import java.util.*;

public class InsuranceTest {

	public static void main(String[] args) {
		ArrayList<Insurance> test=new ArrayList<>();
		
		Car car=new Car("WV Atlas", "AutoCar");
		Pet pet=new Pet("PetSmart", "Cat Jackoo");
		Health health=new Health("BlueCrossPPO");
		
		test.add(car);
		test.add(pet);
		test.add(health);

		System.out.println("---for loop----");
		for(int i=0; i<test.size(); i++) {
			test.get(i).getQuote();
			test.get(i).cancelInsurance();
		}
		System.out.println("----for each!----");
		for(Insurance i:test) {
			i.getQuote();
			i.cancelInsurance();
		}
		System.out.println("----Iterator----");
		Iterator<Insurance> it=test.iterator();
		while(it.hasNext()) {
			Insurance i=it.next();
			i.getQuote();
			i.cancelInsurance();
		}
	}

}
