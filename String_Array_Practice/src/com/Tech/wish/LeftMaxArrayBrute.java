package com.Tech.wish;

public class LeftMaxArrayBrute {
	public static void main(String[] args) {
		int [ ] a= {-3, 6, 2, 4,5,2,8,-9};
		int [][]  b= {{1,5},{2,7}};
		int max=Integer.MIN_VALUE;
	
	  for(int i=0; i<b.length; i++) {
		  int [] r=b[i];
		  int s=r[0];
		  int e=r[0];
		  if(r.length>1) {
			e=r[i];  
		  }
		  
		  for(int j=s; j<=e; j++) {
			  if(max<a[j])
				  max=a[j];
			  
		  }
		  System.out.println(max);
			  
		  }
	  }
  
}


