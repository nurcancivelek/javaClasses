package com.class31;

public class Registration {

	
//		Create Registration Class in which you would have variables as
//		email, userName and password that have an access scope only within
//		its own class. After creating an object of the class user should be
//		able to call methods and in each method separately pass values to set
//		users email, username and password. 
		
		private String email, userName, password;
		
		public String getEmail(String email) {
			
			if(email.contains("@gmail.com")) {
				this.email=email;
				System.out.println(email);
			}
			
			else {
				System.out.println("invalid email, pls use gmail");
			}
			return email;
			
		}
		public String getUserName(String userName) {
			this.userName=userName;
			if((userName.isEmpty())) {
			System.out.println("username cannot be empty and username cannot be less than 6 characters");
			}else if(userName.length()<6) {
				System.out.println("username cannot be less than 6 characters");
			}
				return userName;
		}
		public String getPassword(String password) {
			this.password=password;
			if(password.contains(userName) ) {
				System.out.println("password cannot contain username");
			}else if(password.length()<6) {
				System.out.println("password cannot be less than 6 characters");
			}else if((password).isEmpty()) {
				System.out.println("password cannot be empty");
			}
			return password;
			
			}
		}
	

