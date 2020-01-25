package com.class31;

public class TestMarks {
	public static void main(String[] args) {
		A scoreA=new A(68,78,88);
		System.out.println(scoreA.getPercentage());
		B scoreB=new B(68,78,88,98);
		System.out.println(scoreB.getPercentage());
	}

}
