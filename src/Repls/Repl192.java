package Repls;

import java.util.*;

public class Repl192 {
	
	public static void main(String[] args) {
		LinkedList<String> listN=new LinkedList<>();
		listN = Nurcan();
		
		
		for(String n: listN) {
			System.out.println(n);
		}
	}

	public static LinkedList<String> Nurcan() {
		LinkedList<String> list=new LinkedList<>();
		list.add("John");
		list.add("Brian");
		list.add("Ryan");
		return list;
	}
}
