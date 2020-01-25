package com.class34;

import java.util.*;

class Sweets{
	String name;
	public Sweets(String name) {
		this.name=name;
	}
	public void iLove() {
		System.out.println("I love "+name);
	}
}

public class linkedListDemo2 {
	public static void main(String[] args) {
	
		//create a list of Sweets objects
		LinkedList<Sweets> sweetList=new LinkedList<>();
		sweetList.add(new Sweets("Chocolate"));//sweetList is a collection
		sweetList.add(new Sweets("Cake"));
		sweetList.add(new Sweets("Cookies"));
		sweetList.add(new Sweets("Macaroons"));
		
		//lets display name of each sweet object
		
		for(Sweets element:sweetList) {
			System.out.println(element.name);
			element.iLove();
		}
		//retrieving 1 element and accessing method(2steps)
		Sweets mySweet=sweetList.get(2);
		mySweet.iLove();
		
		//retrieving 1 element and accessing method(2steps)
		sweetList.get(2).iLove();
		String nameOfTheSweet=sweetList.get(2).name;
		System.out.println(nameOfTheSweet);
		
		System.out.println();
		String str="Hello 123";
		//"Hello 123"-->"Hello 456 "---->"Hello 456"
		String n=str.replace("123", "456").trim();//execution happens from left to the right
		System.out.println(n);
		
		Integer num=100;
		//100--> "100"----> "200" ------>        3
int newNumber=num.toString().replace("100", "200").length();
System.out.println(newNumber);
		
	}
}
