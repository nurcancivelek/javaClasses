package Repls;

import java.util.*;

public class Repl211 {
	public static void main(String[] args) {
		
		List<Map<String,Object>> dataList= new ArrayList<>();
		
		Map<String, Object> appleMap= new LinkedHashMap<>();
		appleMap.put("Items", "Apple");
		appleMap.put("Price", 20.00);
		appleMap.put("Quantity", 10.0);
		
		dataList.add(appleMap);
		
		Map<String, Object> orangeMap=new LinkedHashMap<>();
		orangeMap.put("Items", "Orange");
		orangeMap.put("Price", 21.99);
		orangeMap.put("Quantity", 10.0);
		
		
		dataList.add(orangeMap);
		
		Double total=0.0;
		
		for (int i=0;i<dataList.size();i++) {
			String item =  (String) dataList.get(i).get("Items");
			Double price = (Double) dataList.get(i).get("Price");
			Double quantity = (Double) dataList.get(i).get("Quantity");
			
			Double subtotal = price * quantity;
			total += subtotal;
			
			System.out.println("Items: "+item+ " Price: "+price+ " Quantity: "+quantity+" SubTotal: "+subtotal);
		}
		System.out.println("Your Purchase total : "+total);
	}
}
