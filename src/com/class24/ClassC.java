package com.class24;

public class ClassC extends ClassB{
	
	public void canread() {
		System.out.println("Can read!");
		
	}
	
	public static void main(String[] args) {
		
		ClassA gparent=new ClassA();
		System.out.println("This is class a");
		gparent.info();
		gparent.playPiano();
		gparent.canRun();
		System.out.println("----------------");
		
		ClassB parent=new ClassB();
		System.out.println("this is class b");
		parent.hair="Brown";
		parent.eyes="blue";
		parent.info();
		parent.playPiano();
		parent.canRun();
		System.out.println("-------------------");
		
		ClassC kids=new ClassC();
		System.out.println("this is class c");
		kids.eyes="black";
		kids.info();
		kids.canread();
		kids.canSing();
				
	}

}
