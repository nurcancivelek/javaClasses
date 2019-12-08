package com.class13;

public class Recap1 {

	public static void main(String[] args) {
		
		String str1= "Hello";//cok cok onemli
		String str3="Hello"; //str1 ve 3 ayni oldugu icin java 3 u aklinda tutmuyor artik
							//new object with the same value will not be created
		
		//System.out.println(str3);
		String str4= str1.concat("World");
		System.out.println(str1);
		System.out.println(str4);
		String str2=new String("Hello");
		
		String city= "Fairfax";
		String city1="Fairfax";
		System.out.println("------isEmpty()------");
		System.out.println(city.isEmpty());//true || false, boolean value
		
		System.out.println("------.length()------");//how many characters
		System.out.println(city.length());
		int a[]= {12,32,55,77};
		System.out.println(a.length);
		
		System.out.println("-------toUpperCase()----------");
		String newCity=city.toUpperCase();//new object olarak store eder
		System.out.println(newCity);//hep uppercase bassin istersek o zaman yeni bir string olusturmak gerek
		System.out.println(city.toUpperCase()); //upper case olarak basar ama store etmez
		
		System.out.println("-------toLowerCase()----------");
		System.out.println(city.toLowerCase());
	}

}
