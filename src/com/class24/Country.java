package com.class24;

public class Country {
	
	public String capital, name;
	
	
	Country(){
		System.out.println("I am non argument constructor");
	}
	Country(String countryName, String countryCapital){
		name=countryName;
		capital=countryCapital;
	}
	public void display() {
		System.out.println(name+" "+capital);
	}
	public static void main(String[] args) {
		Country country1=new Country("USA", "Washington DC");
		Country country2=new Country("Kazakhistan", "Astana");
		Country country3=new Country();
		
		country1.display();
		country2.display();
		country3.display();
	}
}
