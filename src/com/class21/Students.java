package com.class21;

public class Students {
	
//	Create a Class called Students
//	● Create three variables studentName , studentID and numberOfStudents
//	● Create three objects of the Students Class
//	● Set the value for studentName , studentID and increment the numberOfStudents for each object
//	● Print out total number of students

	public String studentName;
	public int studentID;
	public static int numberOfStudent;
	
	
	//void printInfo() {
		//System.out.println("The total number of students is: "Students.numberOfStudent);
	//}
	
	
	public static void main(String[] args) {
		Students std1=new Students();
		Students std2=new Students();
		Students std3=new Students();
		Students std4=new Students();
		
		std1.studentName="AyseDila";
		std1.studentID=12345;
		Students.numberOfStudent++;
		
		std2.studentName="ElifVera";
		std2.studentID=12346;
		Students.numberOfStudent++;//std2.numberOfStudent++;
		
		std3.studentName="VeraDila";
		std3.studentID=12347;
		Students.numberOfStudent++;//std3.numberOfStudent++;
		
		std4.studentName="VeraDila";
		std4.studentID=12347;
		Students.numberOfStudent++;//std3.numberOfStudent++;
		
		System.out.println("The total number of students is: "+Students.numberOfStudent);
		
	}
}
