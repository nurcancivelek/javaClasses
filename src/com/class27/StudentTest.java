package com.class27;

public class StudentTest {

	public static void main(String[] args) {
		SyntaxStudents ss=new SyntaxStudents();
		ss.study();
		//ss.doHomework();ce: not visible since method inside child is private
		ss.attendClasses();
		ss.research();

		Student student=new SyntaxStudents();
		student.study();
		student.research();
		student.attendClasses();
		//student.doHomework();ce: not visible since method inside parent is private
	}

}


