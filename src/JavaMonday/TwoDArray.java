package JavaMonday;

public class TwoDArray {

	public static void main(String[] args) {
		
		//int [][] numbers=new int[2][3];//row index 0 and 1,
		//columns index 0, 1, and 2
		
		 /*
         * numbers[0][3]=5; numbers[1][3]=7; numbers[2][1]=8;
         * //System.out.println(numbers[0][3]); //System.out.println(numbers[1][3]);
         * //System.out.println(numbers[2][1]);
         */

		
		 int[][] number = { { 2, 5 }, { 12, 23, 45 }, { 4, 7, 9, 0 } };
	       //first way to get value with standard for loop: 
		 for (int i = 0; i < number.length; i++) {
	            for (int j = 0; j < number[i].length; j++) {
	                //System.out.print(number[i][j] + " ");
	            }
	            // System.out.println(number[i]);
	        }
		 //second way to get value from an array with 
		 //enhanced-advanced for each loop
		 
		 int sum=0;
		 for(int[] i:number) {
			 for(int j:i) {
				 System.out.print(j+ " ");
			 }
		 }
	}

}
