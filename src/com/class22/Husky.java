package com.class22;

public class Husky {
	
	// static variables
    static String breed = "Husky";
    static int paws=4;
    static int tail=1;
    
    // instance variable
    String name;
    String color;
    void display() {
    System.out.println("Puppy name is "+name+" and the breed is "+breed);
    }
    public static void main(String[] args) {
        
        Husky dog = new Husky();
        dog.name="Meatball";
        dog.color="Brown";
        
        Husky puppy1=new Husky();
        Husky puppy2=new Husky();

        Husky dog1 = new Husky();
        dog1.name="Sharik";
        dog1.color="black";
        
        puppy2.display();
        System.out.println("Changing breed");
        Husky puppy3=new Husky();
        
        puppy3.name="Jack";
        puppy3.color="grey";
        breed="Bulldog";
        puppy3.display();
        //displaying values from previous instances
        puppy1.display();
        puppy2.display();

 
    }
}