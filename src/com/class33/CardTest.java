package com.class33;

import java.util.*;

public class CardTest {

	public static void main(String[] args) {
		LinkedList<Card> list=new LinkedList<>();
		
		Visa visa=new Visa("VisaCard");
		AppleCard apple=new AppleCard("AppleCard");
		MasterCard master=new MasterCard("MasterCard");
		
		list.add(visa);
		list.add(apple);
		list.add(master);
		
		System.out.println("=====for loop====");
		for(int i=0; i<list.size(); i++) {
			list.get(i).openAccount();
			list.get(i).lateFee();
			list.get(i).transferFee();
		}
		System.out.println("=====for each loop====");
		for(Card i:list) {
			(i).openAccount();
			(i).lateFee();
			(i).transferFee();
		}
		System.out.println("===Iterator====");
		Iterator<Card> it=list.descendingIterator();
		while(it.hasNext()) {
			Card i=it.next();
			i.openAccount();
			i.lateFee();
			i.transferFee();
			
		}
	}

}
