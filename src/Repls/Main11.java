package Repls;

public class Main11 implements Functions {

	double firstNumber, secondNumber;
	@Override
	public double adding(double firstNumber , double secondNumber) {
		this.firstNumber=firstNumber;
	    this.secondNumber=secondNumber;
	    //double result= firstNumber+secondNumber;
	    return firstNumber+secondNumber;
		
	}
	@Override
	public double subtracting(double firstNumber , double secondNumber) {
		this.firstNumber=firstNumber;
	    this.secondNumber=secondNumber;
	    double result= firstNumber-secondNumber;
	    return result;
	}
	@Override
	public double multiplying(double firstNumber , double secondNumber) {
		this.firstNumber=firstNumber;
	    this.secondNumber=secondNumber;
	    double result= firstNumber*secondNumber;
	    return result;
	}
	@Override
	public double dividing(double firstNumber , double secondNumber) {
		 this.firstNumber=firstNumber;
		    this.secondNumber=secondNumber;
		    double result= firstNumber/secondNumber;
		    return result;
	}
	@Override
	public void display(double result) {
		System.out.println("Result is ::: "+result);
			
		}

	public static void main(String[] args) {
		Main11 m=new Main11();
		System.out.println("Result is ::: "+m.adding(100.00, 20.00));
		System.out.println("Result is ::: "+m.subtracting(100.00, 20.00));
		System.out.println("Result is ::: "+m.multiplying(100.00, 20.00));
		System.out.println("Result is ::: "+m.dividing(100.00, 20.00));
	}
	
	
}
