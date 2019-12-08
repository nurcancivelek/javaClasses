package com.class24;

public class Book {
//	Write program as a Book class   that will have 2 Constructors.
//	While creating an object make sure:
//	Instance variables are being initialized
//	Both Constructors are being executed

	String book; 
	String author;
	int copiesSold;
	int publishYear;
	
	Book(String book, String author, int copiesSold){
		this.book=book;
		this.author=author;
		this.copiesSold=copiesSold;
		
	}
	Book(String book, String author, int copiesSold, int publishYear){
		this.book=book;
		this.author=author;
		this.copiesSold=copiesSold;
		this.publishYear=publishYear;
	}
	public void display() {
		System.out.println("The famous "+book+" is written by "+author+". "+copiesSold+
				" copies sold so far and it is first published in "+publishYear);
	}
	public static void main(String[] args) {
		Book b1=new Book("I will never see the world again", "Ahmet Altan", 200000, 2019);
		Book b2=new Book("A long way Gone", "Ishmael Beah", 500000);
		b1.display();
		b2.display();
	}

}
