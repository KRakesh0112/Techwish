package com.Tech.wish;

public class Prefixsum {
	public static void main(String[] args) 
   {
	int a[]= {1,2,3,4,5,6};
	int b[][]= {{1,3},{2,4}};

	int n= a.length;
	int pf[]= new int[n];
	pf[0]=a[0];
	
	for(int i=1;i<n;i++) {
		pf[i]=pf[i-1]+a[i];
	}
	
	for(int j=0;j<b.length;j++) {
		int[]k=b[j];
		int s=k[0];
		int e=k[0];
		int sum=0;
		
		if (k.length>1) {
			s=k[0];
			e=k[1];
		}
		sum=pf[e]-pf[s-1];
		System.out.println(sum);
	}

}
}


