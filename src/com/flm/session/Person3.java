package com.flm.session;

public class Person3
	{
	public void speak()
	{
	System.out.println("I'm a person");
	}
	public static void main(String[] args)
	{
	Person3 p1 = new Students();
	p1.speak();
	}
	}
	class Students extends Person3
	{
	public void speak() {
		System.out.println(" I am a student");
	}
	}


