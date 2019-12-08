package Repls;

public class Repl73 {

	public static void main(String[] args) {
//		Write a program that creates an array of integers that stores the following values:
//		45, 78, 12,  67, 55 and then prints all array values. 
//
//		Output:
//		45 78 12  67 55
		
		int[] a= {45, 78, 12,  67, 55};
		System.out.println(a.length);//kac tane element oldugunu cikarir
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
			//System.out.print(i[a]+" "); array olan a oldugu icin. 
		}
	}
}
