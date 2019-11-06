package Repls;

public class ReplArrays3 {
	public static void main(String[] args) {
//		//REPL 84
//		//2D ARRAY FINdING MAXIMUM
//		
//		
//		
//			int[][] a = {
//				{5,2,3,7},
//				{1,5,1,1},
//				{8,3,1,2}
//			};
//	//should be 8
//	   int max =a[0][0];
//		 for (int i = 0; i < 3; i++) {
//		   for(int j=0; j<4;j++) {
//		    if (a[i][j] > max) {
//		      max = a[i][j];
//	      }
//	     }
//		 }
//		 System.out.println(max);
//	  
//	//finding minimum
//		 
//	int min = a[0][0];
//	for(int i=0;i<3;i++) {
//		for(int j=0; j<4; j++) {
//			if(a[i][j] < min) {
//				min= a[i][j];
//			}
//		}
//	}
//	System.out.println(min);	
//		 
//	//REPL88
//	
//	int[][] aa = {
//			{-5,-2,-3,7},
//			{1,-5,-2, 2},
//			{1,-2, 3,-4}
//		};
//		int sum=0;
//		for(int [] i:aa) {
//		  for(int j:i) {
//		    sum=sum+j;
//		  }
//		  
//		}
//			System.out.println(sum);	
//				//REPL 85
//			int[][] array = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } };
//			 // true
//
//					boolean flag = false;
//					
//					for (int i = 0; i < array.length; i++) {
//						if (array.length == array[i].length){
//							flag = true;
//						}
//						break;
//					}
//					System.out.println(flag);
		//REPL 86
					
					int[][] a = {
							{1,1,2}, //sum = 4
							{3,1,2}, //sum = 6
							{3,5,3}, //sum = 11
							{0,1,2}  //sum = 3
						};
					int[] sumarr=new int[a.length];
			        int sum1=0;
			        for (int i=0;i<a.length;i++){
			          for(int j=0; j<a[i].length;j++){
			           sum1+=a[i][j];
			          }
			          sumarr[i]=sum1;
			          sum1=0;
			          
			        }
			        for(int k=0;k<sumarr.length;k++){
			          System.out.println(sumarr[k]+" ");
			        }
									

	}
}
