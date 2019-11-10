package InterviewQuestions;

public class IQ1 {
	
	public static void main(String[] args) {
		//1- Write a program to swap 2 numbers without a temporary variable? Swap 
	     // strings without a temporary variable?
		
		
		int a=10;
		int b=20;
		a=a+b; //30
		b= a-b; //30-20=10
		a=a-b; //30-10=20
		System.out.println("the value of a= "+a);
		System.out.println("the value of b= "+b);
		System.out.println("-------------------");
		
		int aa=10;
        int bb=5;
        aa=aa*bb; //50
        bb=aa/bb;//10
        aa=aa/bb;//5
        System.out.println("After swapping aa="+aa+", bb:"+bb);
        System.out.println("-----------------");
        
        String d="hello";
        String e="world";
        System.out.println("Before swap: "+d+" "+e);
        d=d+e;
        e=d.substring(0, d.length()-e.length());
        d=d.substring(e.length());
        
        System.out.println("After swap: "+d+" "+e);
        System.out.println("-------------");
       
        String str1="Hello";
        String str2="Bye";
        
        str1=str1+str2;//HelloBye
        str2=str1.substring(0, 5);
        str1=str1.substring((5));
        System.out.println("the value of str1= "+str1);
        System.out.println("the value of str2= "+str2);
        
        String str11="Hello";
        String str22="Welcome"; //7
        
        str11=str11+str22;//HelloWelcome 12
        str22=str11.substring(0, str11.length()-str22.length());
        str11=str11.substring((str22.length()));
        System.out.println("the value of str11= "+str11);
        System.out.println("the value of str22= "+str22);
        
        
        
	}

}
