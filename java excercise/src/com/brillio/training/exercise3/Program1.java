package com.brillio.training.exercise3;


public class Program1 {

	public static void odd(int a1[], int a2[]) {

		if (a1 == null) {
			System.out.println(" first array is empty,Enter the elements");

		}
		if (a2 == null) {
			System.out.println(" second array is empty,Enter the elements");

		}
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] % 2 != 0) {
				System.out.println(a1[i]);
			}
		}
		for (int i = 0; i < a2.length; i++) {
			if (a2[i] % 2 != 0) {
				System.out.println(a2[i]);
			}
		}
	}

	public static void main(String[] args) {

		int[] ar1, ar2;
		ar1 = new int[] { 10, 30, 49, 55, 56 };
		ar2 = new int[] { 12, 44, 27 };
		odd(ar1, ar2);

	}

}
