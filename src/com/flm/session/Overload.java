package com.flm.session;

public class Overload {
     public static void talk() {
    	 System.out.print("hello world");
	}
     public static void talk(String string) {
    	 System.out.print("hello " + string);
    	 
     }
     
     
     public static void main(String []args) {
    	 talk("mattew");
     }
     
}
