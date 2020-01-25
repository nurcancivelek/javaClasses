package com.class33;

public  abstract class Insurance {
	/*
	 * Create  a  class  Insurance  that  will  have  an attribute as
	 * insuranceName and unimplemented behaviour  as  getQuote  and 
	 * cancelInsurance. Create 3 subclasses Car, Pet, Health. 
	 * Car class has it’s own attribute as carModel and Class Pet has petType  attribute.
	 * Create  3  objects  of  the  sub classes  and  store  them  in  ArrayList.
	 * Using  for loop/advanced  for  loop/  iterator  access  all methods of the class. 
	 */
	
	String insuranceName;
	public Insurance(String insuranceName) {
		this.insuranceName=insuranceName;
	}
	
	public abstract void getQuote();
	public abstract void cancelInsurance();

}
class Car extends Insurance{
	
	String carModel;
	
	public Car(String carModel, String insuranceName) {
		super(insuranceName);
		this.carModel=carModel;
	}
	@Override
	public void getQuote() {
		System.out.println("Thank you for choosing "+ insuranceName+"  for your car "+carModel+" we offer  $500 semi-annually" );
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("i am sorry but you cant cancel your insurance");
		
	}
	
}
class Pet extends Insurance{
	String petType;
	public Pet(String insuranceName, String petType) {
		super(insuranceName);
		this.petType=petType;
	}
	@Override
	public void getQuote() {
		System.out.println("Thank you for choosing "+insuranceName+" for your cat Ceku. Yuor qoute is $200 this year!");
	}
	@Override
	public void cancelInsurance() {
		System.out.println("If you cancel your insurance your cat will die!");
	}		
}
class Health extends Insurance {

	public Health(String insuranceName) {
		super(insuranceName);
	}

	@Override
	public void getQuote() {
		System.out.println("your insurance is "+insuranceName+".your quote is $500 per month. "
				+ "and you are not covered for"
				+ " that, neither for that... nope not for that either!");	
	}

	@Override
	public void cancelInsurance() {
		System.out.println("you cant be that naive!");
		
	}
	
}

