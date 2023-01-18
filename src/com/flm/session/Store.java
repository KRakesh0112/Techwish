package com.flm.session;

public class Store {
	private String name;
	private String address;
	public Store(String theName, String theAddress)
	{
	this.name = theName;
	this.address = theAddress;
	}
	
	public String toString() { return this.name + "\n" + this.address; }
	public static void main(String[] args)
	{
	Store myStore = new Store("Barb's Store", "333 Main St.");
	System.out.println(myStore);
	myStore.setName("Barbara's Store");
	myStore.setAddress("555 Pine St.");
	System.out.println(myStore);
	}

	private void setAddress(String string) {
		// TODO Auto-generated method stub
		
	}

	private void setName(String string) {
		// TODO Auto-generated method stub
		
	}
	}


