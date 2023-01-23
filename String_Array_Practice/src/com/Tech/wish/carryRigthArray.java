package com.Tech.wish;

public class carryRigthArray {
	public static void main(String[] arg) {
		int a[] = { 1, 2, 3, 8, 5, 6, 7 };

		findrightsumofarray(a);
	}

	private static void findrightsumofarray(int[] a) {
		int n = a.length;
		int[] rm = new int[n];
		rm[n - 1] = a[n - 1];
		for (int i = n-2; i >=0 ; i--) {
			rm[i] = Math.max(rm[i + 1], a[i]);
		}
		for (int i : rm) {
			System.out.print(i + " ");
		}

	}

}



