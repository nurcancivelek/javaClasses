package com.class6;

public class Recap {
 public static void main(String[] args) {
	/* declare the time (1-24)
	 * based on the time identify wheter it is morning afternoon or 
	 * evening or night
	 * if 1-11 morning
	 * if12-15 noon
	 * 16-20 evening
	 * if >20 night
	 */
	 
	int time=18;
	String timeOfDay=null;
	
	if (time>=1 && time<=11) {
		timeOfDay="Morning";
	}else if(time>=12 && time<=15) {
		timeOfDay="noon";
	}else if(time>=16 && time<=20) {
		timeOfDay="evening";
	}else if(time>20 && time<=24) {
		timeOfDay="Night";
	}else {
		timeOfDay="Invalid";
	}
	System.out.println("Time of the day is "+timeOfDay);
	
	if(timeOfDay.equals("Morning")) {
		System.out.println("Good morning");
	}else if(timeOfDay.equals("noon")) {
		System.out.println("Good afternoon"); 
	} else if(timeOfDay.equals("evening")) {
		System.out.println("Good evening");	
	}else if(timeOfDay.equals("Night")) {
		System.out.println("Good Night");	
	}
 }
}


