package com.Tech.wish;

public class Max_Min {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
	int []	Array = {2,36,45,45,45,45,45,-1};
	     int maxm= Integer.MIN_VALUE;
	     int minm= Integer.MAX_VALUE;
	     for(int i=0; i<Array.length; i++)
	     {
	    	
	    	 if(maxm<Array[i])
	    		maxm=Array[i];
	    	 if(minm>Array[i])
	    		 minm=Array[i];
	    	      
	    }
	     
	     System.out.println(" Maximum of the array:" +maxm);
	     System.out.println(" Minimum of the array:" +minm);
	     for(int j=0; j<Array.length; j++) {
	    	 if(maxm>Array[j])
	    	 count++;
	    	 
	     }
	     
	      
	      int Length=Array.length;
	      // System.out.println(count);
	      int c=Length-count;
	      
	      System.out.println(c);
		    
	 
	

	}

}



