package com.class33;

public abstract class Card {
	/*
	 * Create a Card class that will have implemented and unimplemented methods
	 * and a constructor that  will  initializes  credit  card  type.   
	 * Create  3 subclasses  of  a  Card  card.  Create  3  objects  of different 
	 * card  and  store  them  into  LinkedList. Using  for  loop/advanced  for 
	 * loop/  iterator access all methods of the class.
	 */
	
	String cardType;
	Card(String cardType){
		this.cardType=cardType;
		System.out.println("you card is "+cardType);
	}
	public abstract void openAccount();
	public void lateFee() {
		
		System.out.println("there is a .2 percent late fee for "+ cardType);
	}
	public abstract void transferFee();
}
class Visa extends Card{

	Visa(String cardType) {
		super(cardType);
		//System.out.println("your card is a "+cardType);
	}

	@Override
	public void openAccount() {
		System.out.println("if you have money to spend, open an account with Visa!");
	}
	public void lateFee() {
		
		System.out.println("there is a .5 percent late fee for "+ cardType);
	}
	public void transferFee() {
		System.out.println("no transfer fee for "+cardType);
	}
}
class AppleCard extends Card {

	AppleCard(String cardType) {
		super(cardType);
	}

	@Override
	public void openAccount() {
		System.out.println("omg you too can open an account and have an AppleCard!");
	}
	public void lateFee() {
		
		System.out.println("nope!no late fees for "+ cardType);
	}
	public void transferFee() {
		System.out.println("no transfer fee for "+cardType);
	}
}
class MasterCard extends Card{

	MasterCard(String cardType) {
		super(cardType);
	}

	@Override
	public void openAccount() {
		System.out.println(" of course you can open an account with  "+cardType);	
	}
	public void lateFee() {
		System.out.println(" for "+cardType+ ", late fee is .8 percent per day !");
	}
	public void transferFee() {
		System.out.println("no transfer fee for "+cardType);
}
}








