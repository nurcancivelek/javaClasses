package com.class34;

import java.util.*;


class Student{
	String name;
	int id;
	Student(String name, int id){
		this.name=name;
		this.id=id;
	}
}
public class Task3 {

	public static void main(String[] args) {
		/*
		 * Create a Set collection that will hold Objects of  Student  Type.  
		 * In  this  set  we  do  not  care about the insertion order. Each student 
		 * object should  have  name  and  studentID.  Display name of each student.
		 */

		Set<Student> stuu=new HashSet<>();
		stuu.add(new Student("Ayse1", 1));
		stuu.add(new Student("Ayse2", 2));
		stuu.add(new Student("Ayse3", 3));
		stuu.add(new Student("Ayse4", 4));
		System.out.println("---for each----");
		for(Student s:stuu) {
			System.out.println(s.name);
		}
		System.out.println();
		System.out.println("----iterator-----");
		
		Iterator<Student> it=stuu.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().name);
		}
		
		
		
	}

}
