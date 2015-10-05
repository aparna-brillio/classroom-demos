package com.brillio.training.programs;

import java.util.Arrays;

public class Program01 {

	public static void increment(int[] ar, int by) {
		for (int i = 0; i < ar.length; i++) {
			ar[i] += by;

		}
	}

	public static void main(String[] args) {

		// n is a reference to an array object
		int[] n;
		n = new int[3];

		n = new int[] { 12, 123, 1234 };
		n[2] = 1;
		n[0] = 2;
		// n[3]=3;
		// n[4]=10;//throws ArrayIndexOutOfBound Exception

		int index = 2;
		System.out.println(n[index]);

		System.out.println(Arrays.toString(n));
		increment(n, 10);

		System.out.println(Arrays.toString(n));
		// n[-1]=12;//throws ArrayIndexOutOfBound Exception

	}

}
