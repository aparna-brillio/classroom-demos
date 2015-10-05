
package com.brillio.training.exercise;

public class LargeFactor {

	public static int PrimeFactor(double n) {

		double div = 2;
		double maxFact;
		double result=0;
		if (n <= 1) {
			return -1;
		}

		int i, flag = 0;

		for (i = 2; i <= n / 2; ++i) {
			if (n % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			return -2;
		else {

			while (n != 0) {
				if (n % div != 0)
					div = div + 1;
				else {
					maxFact = n;
					n = n / div;

					if (n == 1) {
						result=maxFact;
						break;
					}
				}
			}
		}
		return (int) result;
	}
public static void main(String[] args) {
	int number=90,x;
	x=PrimeFactor(number);
	System.out.println("the largest prime factor is="+x);
}
}
