package com.class32;

public class Recap {
	public static void main(String[] args) {
        //to store single value 
        int b=10;
        //to store multiple values 
        int[] bb= {10,20,30};
        int [] arr=new int [3];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        //to retrieve all values 1 by 1
        //using enhance loop
        for (int num:arr) {
            System.out.println(num);
        }
        //using for loop
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        //we can store non primitive types: Objects
        
//      Fruit []array={new Apple(), new Orange(), new Banana()};
//      for (Fruit i:array) {}
//      above we created a fruit array. because they all had relation. but not I want to add monkey. bit it is not related to fruit. it is not kinf of fruit. I want to 
        //add it into my array. so we fin a relation. the thing is all classes has a parents which is "Object class". so we will use object class below. 
        //then all will ve in same type. 
        Object f1=new Apple();
        Object f2=new Orange();
        Object f3=new Banana();
        Object m=new Monkey();
        Object[] o= {f1,f2,f3,m};
        for (Object i:o) {}
            
        
    }
}
class Monkey{
    
}
class Fruit{
    
}
class Apple extends Fruit{
    
}
class Orange extends Fruit{
    
}
class Banana extends Fruit{

}
