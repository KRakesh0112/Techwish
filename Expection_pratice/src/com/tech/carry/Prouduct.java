package com.tech.carry;

public class Prouduct {
	  void prouductCheck(int weigth){
		  
			  try {
				  if(weigth<100) 
				  throw new Myexpection(null);
				  
				  else
					  System.out.println(weigth);
			    
				  }
			  catch(Myexpection e) {
				  System.out.println("Prouduct is invalid");
			  }
			  
		  
		  
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
             Prouduct p=new Prouduct();
             p.prouductCheck(101);

	}

}
