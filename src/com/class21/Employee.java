package com.class21;

public class Employee {

//	    CreateaClasscalledEmployee:
//		● Create three variables eID , salary
//		and set the CEO to “Sumair”
//		● Create two objects of the class
//		Employee
//		● Set the value of eID, salary for each of
//		the objects
//		● Print out the eID , salary and CEO for
//		each of the objects

		 int salary;
		 int eid;
		public static String ceo="Sumair";
		
		void printInfo(){
			System.out.println("Employee id: "+eid+" salary is: "+salary+" the CEO is; "+ceo+".");
		}

		public static void main(String[] args) {
			//create two objects:two emps...	
			Employee emp1= new Employee();
				emp1.salary=200;
				emp1.eid= 123;
				Employee.ceo="Sumair";//emp1.ceo="Sumair";
				emp1.printInfo();
				
			Employee emp2=new Employee();
				emp2.eid=124;
				emp2.salary=210;
				emp2.printInfo();
		
		}


}
