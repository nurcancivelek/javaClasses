package com.class21;

public class Forest {
	//Create four classes: Forest, Wolf, Fox, Bear
    //Class wolf has: color, age, numberOfWolves
    //Class fox has: color, speed, numberOfFoxes
    //Class bear has: type, weight, numberOfBears
    
    //Forest has main method
    //Create different objects/instances of different classes
    //At the end, print the total for each animal.
	public static void main(String[] args) {
		Wolf w1=new Wolf();
		Wolf w2=new Wolf();
		Wolf w3=new Wolf();
		
		w1.color= "grey";
		w1.age=3;
		w1.numberOfWolves++;
		w2.color= "white";
		w2.age=6;
		w2.numberOfWolves++;
		w3.color= "brown";
		w3.age=10;
		Wolf.numberOfWolves++;
		
		System.out.println("total number of wolves in the forest is: "+Wolf.numberOfWolves);
		w1.inform();
		w2.inform();
		w3.inform();
		
		System.out.println("=================");
		Bear b1=new Bear();
		Bear b2=new Bear();
		Bear b3=new Bear();
		Bear b4=new Bear();
		
		b1. type="baby panda";
		b1.weight=111;
		Bear.numberOfBears++;
		b2. type="polar";
		b2.weight=222;
		Bear.numberOfBears++;
		b3. type="American black";
		b3.weight=333;
		Bear.numberOfBears++;
		b4. type="Brown";
		b4.weight=321;
		Bear.numberOfBears++;
		
		System.out.println("The total number of bears is: "+Bear.numberOfBears);
		b1.display();
		b2.display();
		b3.display();
		b4.display();
		System.out.println("=================");
		
		Fox f1=new Fox();
		Fox f2=new Fox();
		
		f1.color="Orange";
		f1.speed= 25;
		Fox.numberOfFoxes++;
		f2.color="Grey";
		f2.speed=30;
		Fox.numberOfFoxes++;
		
		System.out.println("the total number of foxes is: "+Fox.numberOfFoxes);
		f1.display();
		f2.display();
		
	}
}
