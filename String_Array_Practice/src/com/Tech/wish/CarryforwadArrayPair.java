package com.Tech.wish;

public class CarryforwadArrayPair {
        
	public static void main(String[] args) {
		
		char[] ch= { 'a' , 'b' , 'e','g','a','g'};
		int carryForwordArrayCharcter = carryForwordArrayCharcter(ch);
		System.out.println(carryForwordArrayCharcter);
		
		

	}
	private static int carryForwordArrayCharcter(char[] ch) {
		 int count=0;
		  int ans=0;
		for(int i=0; i<ch.length; i++) {
			if(ch[i]=='a') {
				count++;
			}
			if(ch[i]=='g') {
				ans++;
			}}
			return count + (--ans);
				
	}

}
