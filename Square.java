package com.flm.session;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		int count=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number ");
		int num=s.nextInt();
		 int value=(int)Math.sqrt(num);
		 System.out.print(value);
		 for(int i=1; i<value; i++)
		 {
			 if(num%i==0)
			 {
				count++;
			 }
			
		 }
          if (count==0)
        	  System.out.println(" it is a prime");
          else
        	  System.out.println(" it not a prime");
	}

}
