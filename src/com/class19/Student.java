package com.class19;

public class Student {
	
	char grade(int score) {
		char grade;
		if(score>=90) {
			grade='A';
		}else if(score>=80 && score<90) {
			grade='B';	
		}else if(score>=70 && score<80){
			grade='C'; 	
		}else if(score>=50 && score<70) {
			grade='D';  
		}else {
			grade='F';
		}
		return grade;
	}
	
	
	public static void main(String[] args) {
		Student graded= new Student();
		char grade1=graded.grade(87);
		System.out.println(grade1);
	}
	
	
	


}
