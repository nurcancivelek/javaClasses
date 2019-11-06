package com.class11;

public class Recap {

	public static void main(String[] args) {
	
		int e[];
		int y[];
		y=new int [3];
		int m[],n;
		m= new int[3];
		//int [] n=new int [4]; [] bir ustte m den sonra geldigi dsadece m i array olarak alir
		//boylece n sadece integer olur. array olmaz. oyuzden:
		//int [] m, n= seklindeki yazim en dogrusudur
		
		
		int[] arr= {2,3,4,5};
		//System.out.println(arr[2]); sadece, index 2 yani value 4 u basar
		
		//	1		 2,5		 4,7			COK ONEMLI
		for(int a=0;a<arr.length;a++) {
		//		3,6		
			System.out.print(arr[a] +" ");
		}
		
		//for(;;) {							en kolay infinite loop yontemi
			//System.out.println("Hello");	interview sorusu
		//}
		//int i=1;
		//for(System.out.println("Hello"); i<=5; i++) {
			
		//.a.}
		//System.out.println("Bye"+ i);
		
		
		//Create an array of cars and store 6 elements into it. 
		//Using 2 different loops print all values from the array.

		String [] cars= {"Audi", "Mercedes", "Wv","BMW", "Honda", "Toyota"};
		for(String cc:cars) {
			System.out.println(cc);
		}
		
		for(int c=0; c<cars.length;c++) {
			System.out.print(cars[c]+ " ");
		}
		//Create an array on integers and calculate the sum of all elements in an array.
		
		int[] array= {11, 23, 34, 45};
		int sum=0;
		for(int b=0; b<array.length;b++) {
		
		sum=sum+array[b]; //sum+=array[b];	
		System.out.println(sum);
		}
		
		
		//Create an array of countries. While retrieving all values from an array 
		//print capital for each country. (use 2 different loops).
		String[] country= {"Turkey", "USA", "Japan"};
		for(int co= 0; co<country.length; co++) {
		switch(country[co])	{
		case "Turkey":
				System.out.println("Ankara");
				break;
			case "USA":
				System.out.println("DC");
				break;
			case "Japan":
				System.out.println("Tokyo");
		
		
		}
		}
		String[] capital= {"ANKARA","WASHINGTON","LONDON", "BRUSSEL"};
		String[] countries= {"Turkey", "USA", "Japan"};
		for(String getCountry:countries) {
			if(getCountry.equals("USA")) {
				System.out.println("The capital of USA is Washington DC");
			}
		}
			for(int i=0; i<countries.length; i++) {
            
            
            System.out.println(countries[i]+"'s capital is "+capital[i]);
        }
    }
	}
