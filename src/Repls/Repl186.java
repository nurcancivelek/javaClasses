package Repls;

import java.util.*;

public class Repl186 {

	 public static void main(String[] args) {
		  
		    ArrayList<Integer> nums=new ArrayList<>();
		    nums.add(111);
		    nums.add(222);
		    nums.add(333);
		    nums.add(444);
		    nums.add(555);
		    nums.add(666);
		    //one way
		    System.out.println(nums.get(0)); 
	         System.out.println(nums.get(2)); 
	         System.out.println(nums.get(4)); 
		    //iterator way
		    Iterator<Integer> it=nums.iterator();
		    while(it.hasNext()){
		      int i=it.next();
		      if(i%2==0){
		        it.remove();
		      }
		    }
		  System.out.println(nums);
		  
		  }
}
