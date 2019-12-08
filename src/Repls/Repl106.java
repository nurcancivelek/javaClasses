package Repls;

public class Repl106 {
	
//	String Car, carColor, carName;
//	int carModelYear;
	
	public static void main(String[] args) {

//	create a class named 'Main' with specific attributes.
//	For you to do:
//	Create two objects in which you will be assigning the following values.
//	carColor='Black'
//	carModelYear=2019
//	carName='BMW'
//
//	carColor='White'
//	carModelYear=2018
//	carName='Toyota'
//
//	Car color is Black and car model year is 2019 and car name is BMW
//	Car color is White and car model year is 2018 and car name is Toyota
		Car car1=new Car();
		car1.carColor="Black";
		car1.carModelYear=2019;
		car1.carName="BMW";	
		
		
		Car car2=new Car();
		car2.carColor="White";
		car2.carModelYear=2018;
		car2.carName="Toyota";

		System.out.println("Car color is "+car1.carColor+" and model year is "+car1.carModelYear+" and car name is "+car1.carName);
		System.out.println("Car color is "+car2.carColor+" and model year is "+car2.carModelYear+" and car name is "+car2.carName);

//		model solution:::
//			class Main {
//			  String carColor, carName;
//				int carModelYear;
//			    
//			    public static void main(String[] args) {
//			      Main car1=new Main();
//					car1.carColor="Black";
//					car1.carModelYear=2019;
//					car1.carName="BMW";	
//					
//					
//					Main car2=new Main();
//					car2.carColor="White";
//					car2.carModelYear=2018;
//					car2.carName="Toyota";
//
//					System.out.println("Car color is "+car1.carColor+" and car model year is "+car1.carModelYear+" and car name is "+car1.carName);
//					System.out.println("Car color is "+car2.carColor+" and car model year is "+car2.carModelYear+" and car name is "+car2.carName);
//
//			      
//			    }
//
//
//
//			}
	}
}