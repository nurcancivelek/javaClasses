package com.class32;

public abstract class Marks {
 //	We  have  to  calculate  the  percentage  of  marks obtained
//	in three subjects (each out of 100) by student A and in four subjects
//	(each out of 100) by  student  B.  Create  class  'Marks'  with  
//	an abstract method 'getPercentage'. It is inherited by classes 'A' and
//	'B' each having a method with the same name which returns the percentage
//	of the students. The constructor of student A takes the  marks  in  three
//	subjects  as  its  parameters and the marks in four subjects as its
//	parameters for student B. Test your code
	public abstract double getPercentage();
}
class A extends Marks {
	double math, science,art;
	A(double math, double science, double art){
		this.math=math;
		this.science=science;
		this.art=art;
	}
	@Override
	public double getPercentage() {
		
		return (math+science+art)/3;
	}
	
}
class B extends Marks{
	double math, science,art, pe;
	B(double math, double science, double art, double pe){
		this.math=math;
		this.science=science;
		this.art=art;
		this.pe=pe;
	}
	@Override
	public double getPercentage() {
		
		return (math+science+art+pe)/4 ;
	}
	
}

