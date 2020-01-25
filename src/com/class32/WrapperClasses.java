package com.class32;

public class WrapperClasses {

	public static void main(String[] args) {
		int num=10;
		//Autoboxing --> converting primitive type into an object type
        Integer integer = 1000000; 
        System.out.println(integer.MIN_VALUE);
        String str = integer.toString();
        System.out.println(str);
        //converting boolean primitive type into Boolean Object type
        Boolean bool = true;
        Byte $b=20;
        System.out.println($b.MAX_VALUE);

        //autoUnboxing--> converting Object type into a primitive type
        int num1=new Integer(10);
        System.out.println(num1);



	}

}
