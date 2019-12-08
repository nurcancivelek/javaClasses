package com.class24;

public class Food {
	
	String name;
	String season;
//	 Food(String name, String season){
//		 this.name=name;
//		 this.season=season;
 //}
	 public void isHealthy() {
		 name="Fruit";
		 System.out.println("This "+name+" is very healthy");
	 }
	public void info() {
		System.out.println("the name of the fruit is "+name+". it grows in "+season);
	}
}
