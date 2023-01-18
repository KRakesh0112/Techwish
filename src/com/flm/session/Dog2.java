package com.flm.session;

public class Dog2 {
	
	private String name;
	public Dog2(String name)
	{
	this.name = name;
	}
	public boolean equals(Object o )

	{
		Dog2 d1 =  (Dog2) o;
	if(o==this)
		return true;
	 if(this.name.equals(d1.name))	
		 return true;
	return false;
	 
				 
	
	}
	public static void main(String[] args)
	{
	Dog2 d1 = new Dog2("Rufus");
	Dog2 d2 = new Dog2("Sally");
	Dog2 d3 = new Dog2("Rufus");
	Dog2 d4 = d3;
	System.out.println(d1.equals(d2));
	System.out.println(d2.equals(d3));
	System.out.println(d1.equals(d3));
	System.out.println(d3.equals(d4));
	}
	

}
