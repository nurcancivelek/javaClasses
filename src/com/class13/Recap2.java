package com.class13;

public class Recap2 {
	
	public static void main(String[] args) {
		String str1= "Hello";
		String str2="Hello";
		
		System.out.println(str1.equals(str2));//compares objects, values
		System.out.println(str1==str2); // compares location of the object
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println("===========");
		String str3=new String("Bye");//when you create new string then it wont be equal??
		String str4=new String("Bye");
		System.out.println(str3.equals(str4));
		System.out.println(str3==str4);
		
		System.out.println("------.contains()--------");
		System.out.println(str1.contains("ll"));
		System.out.println(str1.contains("zs"));
		
		System.out.println("------.startsWith() and .endsWith()--------");
		
		String str5= "Today is Saturday";
		System.out.println(str5.startsWith("Today"));
		System.out.println(str5.endsWith("Day"));
		
		System.out.println("--------.concat()---------");// attach two strings
		System.out.println(str5.concat(" and we have Java class"));
		
		System.out.println("------.trim()--------");
		
		String str6="  It is sunny  ";
		System.out.println(str6);//trims white spaces only
		System.out.println("Before trimming: "+str6);
		System.out.println(str6.trim());
		
		System.out.println("------.indexOf(int ch) and CharAt()int index)--------");
		
		String str7="Tomorrow we will be done with String Manipulation";
		System.out.println(str7.indexOf('e'));//ilk e nin indexi
		System.out.println(str7.indexOf('e',11));//index 11dan baslayarak e nin indexi
		//olmayan karakter soruldugunda cevap -1 olarak basilir.
		System.out.println(str7.indexOf("we"));
		System.out.println(str7.charAt(10));//10. indexte ne var onu basar
		
		
	}

}
