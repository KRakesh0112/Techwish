package com.tech.carry;

public class Calculator {

	   int  a;
	   int  b;
	   Calculator(int a, int b){
		   this.a=a;
		   this.b=b;
	   }
	  void  Add(){
		  try {
			  if(a<0 || b<0) {
				  throw new ArithmeticException();
			  }
			  int Ad= a+b;
			  System.out.println("Addition of two numbers" +Ad);
		        }
				  catch(ArithmeticException e) {
					  
					  System.out.println(" Please Enter positive number");
					  System.out.println(e);
				  }catch (NumberFormatException e) {
					  
					System.out.println("please enter Integer numbers ");
				}
		  
		 
		       }
		  
		 
	  
	  
	  
	  void Subtract() {
		  try {
			  if(a<0 ||b<0) {
				  throw new ArithmeticException();
			  }
			  int Su= a-b;
			  System.out.println("Subtraction of two numbers" +Su);
			 
		  }
		  catch(ArithmeticException e) {
			  System.out.println(e);
			  System.out.println(" Please Enter a Vaild number");
		  }
		  catch(NumberFormatException e) {
			  System.out.println("please enter Integer numbers ");
			  
			  
		  }
		    
	  }
	  
	  void Mutiply() {
		  try {
			  if(a==0||b==0) {
				  throw new ArithmeticException();
			  }
			  int Mu= a*b;
			  System.out.println("Multiplication of two numbers" +Mu);
		  }
		  catch(ArithmeticException e) {
			  System.out.println(e);
			  System.out.println(" Please Enter a Vaild number");
		  }
		  catch(NumberFormatException e) {
			  System.out.println("please enter Integer numbers ");
			  
			  
		  }
		  
	  }
	  
	  
	  void Division() {
		  try {
			  
				  int Di= a/b;
				  System.out.println("Division numbers" +Di);
			 
		  } catch(ArithmeticException e) {
	     System.out.println(e);
			  System.out.println(" Please Enter a Vaild number");
		  }
		  catch(NumberFormatException e) {
			  System.out.println("please enter Integer numbers ");
			  
			  
		  }
		  
	  }


		

}

