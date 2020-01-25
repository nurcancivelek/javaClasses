package com.class32;

public class Encaps {

	public static void main(String[] args) {
		EncapsulationDemo1 ed=new EncapsulationDemo1();
	    ed.getEmpName("John");
	    String name= ed.getEmpName("John");
	    ed.getEmpAge(30);
	    int age= ed.getEmpAge(30);
	    System.out.println("Employee Name: "+name);
		    System.out.println("Employee Age: "+age);
	    
	    
	  }
	}


