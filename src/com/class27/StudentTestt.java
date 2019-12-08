package com.class27;

public class StudentTestt {
	
	public static void main(String[] args) {
		Studentt obj=new Studentt();
		obj.study();
		obj.practice();
		Studentt obj1=new SyntaxStudent();
		obj1.study();
		obj1.practice();
		System.out.println("----------for---------------");
		Studentt[] array1= {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent() };
		
		for(Studentt s:array1) {
			s.study();
			s.practice();
			s.attendClasses();
			
		}
	}

}
