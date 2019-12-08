package com.class25;

public class Test {
	public static void main(String[] args) {
		System.out.println("-----Creating an object of a Employee class-----");
		Employee emp=new Employee();
		emp.salary=70000;
		Employee.companyName="Syntax";
		emp.work();
		emp.getPaid();
		
		System.out.println("----Creating an object of a Scrum Team class-----");
		ScrumTeam sm=new ScrumTeam();
		sm.salary=90000;
		sm.work();
		sm.getPaid();
		sm.artifacts="Product backlog, Sprint Backlog, Burndown Chart";
		sm.ceremonies="Sprint Demo, Planning, Retro, Daily StandUp";
		sm.attendScrumMeetings();
		System.out.println("-----Creating an object of Developer class----");
		Developer dev=new Developer();
		dev.salary=130000;
		dev.work();
		dev.getPaid();
		dev.code();
		dev.artifacts="Sprint BackLog";
		dev.employeeId=101;//protected but accessible
	//employee ssn is not accessible, it is private access modifier
		
		System.out.println("-----Creating an objects of tester class------");
		Tester tt=new Tester();
		tt.salary=80000;
		Employee.companyName="Microsoft";
		tt.work();
		tt.test();
		tt.getPaid();
		tt.ceremonies="Sprint Demo, Planning, Retro, Daily StandUp";
		tt.attendScrumMeetings();
		
		System.out.println("-----Creating an objects of Scrum Master class------");
		ScrumMaster smr=new ScrumMaster();
		
		Employee.companyName="Microsoft";
		smr.salary=100000;
		smr.getPaid();
		smr.coordinateTeam();
		smr.ceremonies="Sprint Demo, Planning, Retro, Daily StandUp";
		smr.attendScrumMeetings();
		
		System.out.println("-----Creating an objects of Product Owner class------");
		ProductOwner po=new ProductOwner();
		Employee.companyName="Microsoft";
		po.salary=150000;
		po.getPaid();
		po.prioritize();
		po.ceremonies="sprint Demo, Planning";
		po.attendScrumMeetings();
		
		
	}

}
