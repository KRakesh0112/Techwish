package com.flm.session;

public class Student {
	public static void greet() {
		System.out.println("hello");
	}

	public static void greet(String name)
	{
	System.out.println("Hello " + name);
	}
	public static void main(String[] args)
	{ 
    greet(); 		
	greet("Sansa");
	}
	}


