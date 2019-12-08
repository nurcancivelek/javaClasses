package com.class28;

public class UserClass {
	String name;
	int mobile;
	UserClass(){}
	
	UserClass(String name, int mobile){
		this.name=name;
		this.mobile=mobile;
	}

}
class UserInfo extends UserClass{
	String address;
	UserInfo(String name,int mobile, String address){
		super(name, mobile);
		this.address=address;
	}
	void userDetails() {
		System.out.println(name+" "+mobile+" "+address);
	}
}
