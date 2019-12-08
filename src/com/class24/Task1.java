package com.class24;

public class Task1 {
	String breed;
	String color;
	int age;
	String name;
	
	public Task1(String name, String myCatsColor, int myCatsAge, String myCatsBreed ) {
		 this.name=name;
		color=myCatsColor;
		age=myCatsAge;
		breed=myCatsBreed;
	}
	public Task1(int myCatsAge1, String myCAtsBreed) {
		age=myCatsAge1;
		breed=myCAtsBreed;
	}
	protected Task1(String myCatsColor2, String myCatsName2 ) {
		color= myCatsColor2;
		name= myCatsName2;
	}
	private Task1(int myCatsAge3,String myCatsName3, String myCAtsBreed3 ) {
		age=myCatsAge3;
		name=myCatsName3;
		breed=myCAtsBreed3;
	}
	public void display() {
		System.out.println("My cat's names is "+name+ ", he is "
	+color+", he is "+breed+" and "+age+" years old");
	}
	//static access modifier cannot be used.
	public static void main(String[] args) {
		Task1 cat1=new Task1("Ceku", "Grey", 2, "RussianBlue");
		Task1 cat2=new Task1(3, "RussianBlue");
		Task1 cat3= new Task1("Grey","Jackoo");
		Task1 cat4=new Task1(3, "Jackoo", "RussianBule");
		cat1.display();
		cat2.display();
		cat3.display();
		cat4.display();
	}
}
