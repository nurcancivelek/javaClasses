package com.class32;

import java.util.ArrayList;

public class Task {
	
	public static void main(String[] args) {
		ArrayList<String>arrayList=new ArrayList<>();
		arrayList.add("Nurcan");
		arrayList.add("Tilda");		
		arrayList.add("Ayse");
		arrayList.add("Dilbara");
		arrayList.add("Nilufer");
		
		System.out.println("Is array list empty? "+arrayList.isEmpty());
		System.out.println("Does array list contain  Elif?"+arrayList.contains("Elif"));
		System.out.println(arrayList.size());	
		System.out.println(arrayList);
		}
		
	}


