package com.flm.session;

public interface Test {
     void  talk();
     void walk();
	

	
  public class Mach implements Test{
	  @Override
public void talk() {
	System.out.println(" im talking ");	
}

@Override
public void walk() {
	System.out.println(" im walking on the ocean");
	
}
}
}
