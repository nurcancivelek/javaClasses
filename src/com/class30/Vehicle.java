package com.class30;

public abstract class Vehicle {
	//this class is 50% defined 
    
	String vinNumber;
	static int totalVehicles;
	
	Vehicle(String vinNumber){
		this.vinNumber=vinNumber;
		totalVehicles++;
	}
	
	
	public void drive() {
        System.out.println("To drive the car you should press the gas");
    }
    public void stop() {
        System.out.println("To stop the car you should press the break");
    }
    
    public static void displayTotal() {
		System.out.println("Total vehicles we build="+totalVehicles);
	}
    
    public abstract void start();
    public abstract void Performance();
}
abstract class Car extends Vehicle{//this class is 75% defined/
   
	String carType;
	
	Car(String vinNumber, String carType){
	 super(vinNumber) ; 
	 this.carType=carType;
   }
	public void speed() {
        System.out.println("Max car speed up to 400");
    }
	public abstract void breaking();
	
	public void start() {
        System.out.println("It starts by start botton");
    }
    public abstract void door();
}
class BMW extends Car{//this class is 10% defined so we can create object of this class
   String make, model;
	BMW(String vinNumber, String carType, String make, String model){
		super(vinNumber, carType);
		this.make=make;
		this.model=model;
	}
	
	@Override
    public void Performance() {
        System.out.println("Performance of the BMW i8 is 4.4 seconds");
        
    }
    @Override
    public void door() {
        System.out.println("it has 2 doors");
        
    }
    public void display() {
    	System.out.println("we build "+make+" "+model+" with vin#: "+vinNumber);
    }

	@Override
	
		public void breaking() {
			System.out.println("BMW can break");
		}	
		
	}

