package com.Tech.wish;

public class RightofMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 6,4,-2,56,46,12,78};
		int[][] query = { {2,5}, {3,6},{1,5} };
		int[] findrightmax = findrigthtmax(input, query);
		for(int i: findrightmax) {
			System.out.println( i +" ");
		}
	
	}

	private static int[] findrigthtmax(int[] input, int[][] query) {
		
		int[] minright = new int[input.length];
		int[] output = new int[query.length];
		for(int i=0; i<output.length; i++) {
			int[] js=query[i];
			int s=js[0];
			int e=js[1];
			minright[e-1]=input[e-1];
			for(int k=e-2; k>=s; k--) {
			minright[k]=Math.min(minright[k+1], input[k]);
			}
			output[i]=minright[s];
		}
		return output;
	}


}
