package com.brillio.training.exercise;

public class Decimal {
	public static boolean isBinaryNumber(int b) {

		boolean status = true;
		while (true) {
			if (b == 0) {
				break;
			} else {
				int tmp = b % 10;
				if (tmp > 1) {
					status = false;
					break;
				}
				b = b / 10;
			}

		}
	
		return status;
	}

	public static double printDecimal(int binary) {
		boolean a;
		int rem = 0, p=0;
		double decimal_val = 0;
		a = isBinaryNumber(binary);
		if (a == false) {
			System.out.println("invalid number");
		} else {
			while(true)
			{
				if(binary==0)
				{
			break;
				}
				else{
				rem = binary % 10;
				decimal_val = decimal_val + rem * Math.pow(2, p);
				binary = binary / 10;
				p++;
				}
			}
		}
	
		return decimal_val;
	}

	public static void main(String[] args) {
		int n = 1000;
		double x = printDecimal(n);
		System.out.println(x);

	}

}
