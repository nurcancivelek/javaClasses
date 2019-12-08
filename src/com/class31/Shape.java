package com.class31;

public interface Shape {
	void calculateArea();
    void calculatePerimiter();
}
class Circle implements Shape{
    int r=14;
    @Override
    public void calculateArea() {
        
        double area=3.14*r*r;
        System.out.println(area);
    }
    @Override
    public void calculatePerimiter() {
        
        double pr=2*3.14*r;
        System.out.println(pr);
        
    }
    
}
class Square implements Shape{
    @Override
    public void calculateArea() {
        int a=70;
        int area=a*a;
        System.out.println(area);
        
    }
    @Override
    public void calculatePerimiter() {
        int a=70;
        int pr=4*a;
        System.out.println(pr);
        
    }


}
