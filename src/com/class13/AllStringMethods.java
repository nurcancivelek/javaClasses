package com.class13;

public class AllStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//.replace
				String str="your Syntax Technologies. is your place to study";
				System.out.println(str.replace('y', 'i'));
				
				System.out.println("**************");
				System.out.println(str.replace("your", "My"));
				System.out.println(str.replaceAll("\\s", ""));
				
				System.out.println("**************");
				//.replaceAll
				String str2="Video provides a powerful way to help you prove your point. "
						+ "When you click Online Video, you can paste in the embed "
						+ "code for the video you want to add. ";
				System.out.println(str2.replaceAll("to(.*)", ""));
				
				System.out.println("**************");
				String str3="23423Hell3049o^&*^&*$%$";
				System.out.println(str3.replaceAll("[0-9]", ""));
				System.out.println(str3.replaceAll("[^a-zA-Z^]", ""));
				System.out.println(str3.replaceAll("[a-zA-Z0-9]", ""));
				System.out.println(str3.replaceAll("[^a-zA-Z]", ""));
				System.out.println(str3.replaceAll("\\w", ""));//it will remove all letters and numbers
				System.out.println(str3.replaceAll("\\W", ""));//it will print only letters and numbers.
				System.out.println("**************");
				System.out.println(str2.replaceFirst(" ", ""));
				

		
	}

}
