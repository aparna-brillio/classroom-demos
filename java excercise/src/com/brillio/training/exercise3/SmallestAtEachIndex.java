package com.brillio.training.exercise3;

public class SmallestAtEachIndex {

	public static void SmallestElement(int a1[], int a2[]) {
		int temp = 0, i;
		int[] a3, a4;
		if (a1.length < a2.length) {
			a4 = new int[a1.length];
			a3 = new int[a2.length];
		} else {
			a4 = new int[a2.length];
			a3 = new int[a1.length];
		}
		for (i = 0; i < a4.length; i++) {
			if (a1[i] < a2[i]) {
				temp = a1[i];
				a1[i] = a2[i];
				a2[i] = temp;

			}

			a3[i] = a2[i];
			System.out.println(a3[i]);
		}

		for (i =a4.length; i <a3.length; i++) {
			a3[i] = a2[i];
			System.out.println(a3[i]);
		}
	}

	public static void main(String[] args) {

		int[] a1, a2;
		a1 = new int[] { 5, 15, 25, 459 };
		a2 = new int[] { 5, 15, 30, 58, 8 };
		SmallestElement(a1, a2);

	}
}
