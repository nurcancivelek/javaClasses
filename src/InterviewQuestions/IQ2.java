package InterviewQuestions;

import java.util.Arrays;

public class IQ2 {

	public static void main(String[] args) {
		// 2- Write a java program to find the second largest number in the array? 
	    //Maximum and minimum number in the array?
		int[] array= {100,-90,898,0,-90,8787};
		
		//easiest way
		Arrays.sort(array);
		int mini=array[0];
		int maxi=array[array.length-1];
		int seco=array[array.length-2];
		
		System.out.println(mini);
		System.out.println(maxi);
		System.out.println(seco);
		
		System.out.println("----------------");
		
		//second way
		int[] marray= {100,-90,8787,898,0,-90,8787};
		int largest=marray[0];
		int smallest=marray[0];
		
		for(int i=0; i<marray.length; i++) {
			if (marray[i]>largest) {
				largest=marray[i];
			}
			if(marray[i]<smallest) {
				smallest=marray[i];
			}
		}
		System.out.println("the smallest value in the array is "+smallest);
		System.out.println("the largest value in the array is "+largest);
		
		
		System.out.println("----------------");
		int[] nums= {100,-90,8787,898,0,-90,8787};
		int large=nums[0];
		int secondlarge=nums[0];
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>large) {
				secondlarge=large;
				large=nums[i];
;			}
			if(nums[i]>secondlarge && nums[i]<large) {
				secondlarge=nums[i];
			}
		}
		System.out.println("the second largest number is "+secondlarge);
		System.out.println("_----------------");
		 int [] arr= {3,22,32,4,-9,56,1,77};
	        
	        int max=0;
	            
	        for (int i=0;i<=arr.length-1;i++) {
	            
	            if (arr[i]>max) {
	                max=arr[i];
	            }   
	        }
	        int min=max;
	        for(int i=0;i<arr.length-1;i++) {
	            if(arr[i]<min) {
	                min=arr[i];
	            }
	        }
	        
	        int max2=0;
	        for (int i=0;i<=arr.length-1;i++) {
	            
	            if (arr[i]>max2 & arr[i]<max) {
	                max2=arr[i];
	            }   
	        }
	        
	        Arrays.parallelSort(arr);
	        
	        System.out.println("second max = "+arr[arr.length-2]);
	        System.out.println("(for loop) second max = "+max2);
	        
	        System.out.println("min= "+ min);
	        System.out.println("max= "+ max);
	        


	}

}
