package com.class20;

public class MySonMath { //modifiers: public default, protected and private
	String name;
    void add1() {//public void: can be seen accessed from everywhere
        int num1 = 2;
        int num2 = 1;
        int result = num1 + num2;
    }
    void add2(int num1, int num2) { //default void: can be seen accessed within the package
        int result = num1 + num2;	//and subclasses
    }
    int add3() {// protected int: can be seen accessed within the package
        int num1 = 4;
        int num2 = 2;
        int result = num1 + num2;
        return result;
    }
    int add4(int num1, int num2) {//private int:can be seen/accessed within this class only
        int result = num1 + num2;
        return result;
    }


}
