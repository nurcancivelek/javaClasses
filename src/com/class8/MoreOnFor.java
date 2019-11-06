package com.class8;

public class MoreOnFor {
	
	public static void main(String[] args) {
		
	int sumAll=0;
	for(int i=0; i<=20; i+=5) {
		sumAll=sumAll+ i;
	}
		System.out.println(sumAll);
	
	int sum=0;
	for(int a=1; a<=5; a++) {
		sum=sum + a;
		System.out.println(sum);
	}
	int total=2;
	
	for(int y=1; y<=3; y++) {
		total*=y;  // 2=2*1; 4=2*2; 12=4*3
	}
	
	System.out.println(total);
	}
}
