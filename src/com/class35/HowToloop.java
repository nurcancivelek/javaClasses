package com.class35;

import java.util.*;



public class HowToloop {
	
	public static void main(String[] args) {
		Map<String, Integer> classroomMap=new LinkedHashMap<>();
		classroomMap.put("Table", 20);//Entry<Key, Value>
		classroomMap.put("Chair", 60);//Entry<String, Integer>
		classroomMap.put("Screen", 3);
		classroomMap.put("Student", 60);
		classroomMap.put("Instructor", 3);
		System.out.println(classroomMap);
		for( Map.Entry<String, Integer> entry:classroomMap.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
			}
		
		System.out.println();
		System.out.println(" ------------iterator-------");
	Iterator<Map.Entry<String, Integer>> classRoomIterator=classroomMap.entrySet().iterator();
	while(classRoomIterator.hasNext()) {
		Map.Entry<String, Integer> entry=classRoomIterator.next();
			System.out.println(entry.getKey()+"="+entry.getValue());}
		
	}

}
