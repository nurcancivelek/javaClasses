package com.class36;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class CarTest{
	
	//create a car class that has variables, methods and constructor
	// create a map that will hold car number and car objects
	public static void main(String[] args) {
		
		Map<Integer, Car> mapCar=new LinkedHashMap<>();
		mapCar.put(1, new Car("BMW","X5" ));
		mapCar.put(2, new Car("Tesla", "S") );
		mapCar.put(3, new Car("Mercedes","S5") );
		mapCar.put(4, new Car("Toyota","Rav4") );
		mapCar.put(5, new Car("Honda", "Civic") );
		mapCar.put(2, new Car("Lincoln", "Mkc") );
		
		System.out.println(mapCar.size());
			
		//display only value objects
		Collection<Car> coll=mapCar.values();
		for(Car c:coll) {
			
			System.out.println(c.make+"---"+c.model);
			c.display();
		}
		
		//map key to its corresponding values(entrySet or keySet)
		
		Set<Entry<Integer, Car>> set=mapCar.entrySet();
		for(Entry<Integer, Car> ent:set) {
			Integer i=ent.getKey();
			Car c=ent.getValue();
			System.out.println("Key "+i+" is associated with value of "+c.make);
		}
		
		//using keySet to map keys to values
		
		Set<Integer> keySet=mapCar.keySet();
		for(int key:keySet) {
			//integer+map object-->value object(car type)
			//System.out.println(key+"="+mapCar.get(key).make+"_"+mapCar.get(key).model);
			Car car=mapCar.get(key);
			String carDetails=car.make+"-"+car.model;
			System.out.println(key+"="+carDetails);
		}
		
		//use iterator to iterate through values , keySet and entrySet
		
		Iterator<Entry<Integer, Car>>entryIterator=set.iterator();
		while(entryIterator.hasNext()) {
			Entry<Integer, Car>ent=entryIterator.next();
			String entry=ent.getKey()+"--"+ent.getValue().make+" "+ent.getValue().model;
			System.out.println(entry);
	}
 }
}
