package InterviewQuestions;

import java.util.Arrays;

public class Questiontwo {
	public static void main(String[] args) {
		
		// Write a java program to find the second largest number in the array?
				//Maximum and minimum number in the array?
		
		int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
        Arrays.sort(arr);
        
        System.out.println("the min is:"+arr[0]);
        System.out.println("the max is:"+arr[arr.length-1]);
        System.out.println("the second largest is:"+arr[arr.length-2]);          

	}

}
