package com.class9;

public class Clock {
	
	public static void main(String[] args) {
		
		//24 hours, 60 minutes
		// saniyeleri de sen ekle!!!!!
		
		for(int h=0; h<24; h++) {
			
			for(int m=0; m<60; m++) {
				if(m<10) {
				System.out.println(h+ ":0"+m);
				//}else if	
			}else {
				System.out.println(h+ ":"+m);
			}
			}
		}
		
		System.out.println("**********************");
		//month/12, days=30
		
		for(int m=1; m<13; m++) {
			
			for(int d=1; d<31; d++) {
				System.out.println(m+" "+d);
			}
		}
		for(int n=0; n<10;n++) {
			for(int m=0; m<10;m++) {
				for(int o=0; o<10;o++) {
					for(int p=0; p<10;p++) {
						System.out.println(m+" "+n+" "+o+" "+p );
					}
				}
			}
		}
	}
}
