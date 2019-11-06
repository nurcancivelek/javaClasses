package InterviewQuestions;

import java.util.Arrays;

public class Question2Again {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?
		//Maximum and minimum number in the array?
		
		int[] a= {13, 65, 79, 12,1,  47, 99, 25};
//		int largest = a[0];
//        int secondLargest = a[0];
//        int minimum=a[0];
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] > largest) {
//                secondLargest = largest;
//                largest = a[i];
//            } else if (a[i] > secondLargest) {
//                secondLargest = a[i];
//            }
//        }
//        for(int i=0; i<a.length; i++) {
//        	if(a[i] <minimum) {
//        		minimum=a[i];
//        	}
//        }
        Arrays.sort(a);
        System.out.println("the min is:"+a[0]);
        System.out.println("the max is:"+a[a.length-1]);
        System.out.println("the second largest is:"+a[a.length-2]);  
		
	}
	}


