package InterviewQuestions;

import java.util.Arrays;

public class Question2 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?
		//Maximum and minimum number in the array?
		int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
        int largest = arr[0];
        int secondLargest = arr[0];
        
//        System.out.println("The given array is:" );
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        //System.out.println();
        //System.out.println("Second largest number is: " + secondLargest);
        
       // int arr1[] = {10, 215, 45, 90, 1357};
        //int max = Arrays.stream(arr1).max().getAsInt();
       // System.out.println("Largest in given array is " +max);
 Arrays.sort(arr);
        
        System.out.println("the min is:"+arr[0]);
        System.out.println("the max is:"+arr[arr.length-1]);
        System.out.println("the second largest is:"+arr[arr.length-2]);  
        
	}

}
