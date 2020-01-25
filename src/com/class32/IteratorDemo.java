package com.class32;

import java.util.*;

public class IteratorDemo {
	
	public static void main(String[] args) {
        ArrayList<String> arraylist=new ArrayList<>();
        arraylist.add("tilda");
        arraylist.add("tilda1");
        arraylist.add("tilda2");
        arraylist.add("tilda3");
        arraylist.add("tilda4");
        System.out.println(arraylist.get(0)+arraylist.get(3));
        
        //retrieve values from an arrayList
        //for loop
        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }System.out.println("----1------");
        //enhanced for
        for (String string : arraylist) {
            System.out.println(string);
        }System.out.println("-----2-----");
        // iterator way
        Iterator <String> it=arraylist.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }System.out.println("----3-----");
        
    }


}
