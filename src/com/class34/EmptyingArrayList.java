package com.class34;

import java.util.ArrayList;

public class EmptyingArrayList {

	public static void main(String[] args) {
		System.out.println("Welcome to Java Program to empty an ArrayList");

	    ArrayList<String> listOfInsurance = new ArrayList<>();

	    listOfInsurance.add("Car Insurnace");
	    listOfInsurance.add("Health Insurnace");
	    listOfInsurance.add("Life Insurance");
	    listOfInsurance.add("Home Furniture Insurance");
	    listOfInsurance.add("Home loan Insurance");

	    System.out.println("ArrayList before emptying: ");
	    System.out.println(listOfInsurance);

	    // Emptying an ArrayList in Java
	    listOfInsurance.clear();

	    System.out.println("ArrayList after emptying: ");
	    System.out.println(listOfInsurance);

	    ArrayList<String> listOfLoans = new ArrayList<>();

	    listOfLoans.add("Car loan");
	    listOfLoans.add("Persona loan");
	    listOfLoans.add("Balance transfer");
	    listOfLoans.add("Home loan");

	    System.out.println("ArrayList before removing all elements: ");
	    System.out.println(listOfLoans);

	    // Emptying an ArrayList in Java
	    listOfLoans.removeAll(listOfLoans);

	    System.out.println("ArrayList after removing all elements: ");
	    System.out.println(listOfLoans);
	  }

	}


