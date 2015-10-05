package com.brillio.training.exercise;

public class SquareRoot {

	public static int NearestInteger(int n) {
		if (n <= 0) {
			return -1;
		}
		int a =  (int) Math.sqrt(n);
		return a;
	}

	public static void main(String[] args) {
		int i =1234, x;
		x = NearestInteger(i);
		System.out.println("Nearest Integer is " + x);
	}

} 
