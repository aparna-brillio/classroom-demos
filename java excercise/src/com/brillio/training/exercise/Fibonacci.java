package com.brillio.training.exercise;

public class Fibonacci {
	public static int FibonacciSeries(int n) {
		int f = 0, f1=0,  f2=1;
		if (n<=0) {
			return -1;
		}
		else if (n>=100) {
		
			return -2;
		}
		else {
			for (int i = f1; i <= n-3; i++) {
				f = f1 + f2;
				f1 = f2;
				f2 = f;
			}
		}
		System.out.print(f);
		return 0;
	}

	public static void main(String[] args) {
		int n = 7;
		
		FibonacciSeries(n);
	}
}
