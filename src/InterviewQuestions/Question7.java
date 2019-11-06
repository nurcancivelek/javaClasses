package InterviewQuestions;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?
		//prime number or not
        Scanner scan=new Scanner(System.in);
        
        int num=scan.nextInt();
        int i,m=0,flag=0;     
          m=num/2;    
          if(num==0||num==1){
           System.out.println(num+" is not prime number");    
          }else{
           for(i=2;i<=m;i++){    
            if(num%i==0){    
             System.out.println(num+" is not prime number");    
             flag=1;    
             break;    
            }    
           }    
           if(flag==0)  { System.out.println(num+" is prime number"); }
          }
	}

}
