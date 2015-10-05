package com.brillio.training.exercise;

public class FutureTime {
	/*
	 * Write a Java function to print the future time. The function takes 4
	 * arguments. The first 3 arguments (h, m, s) represent a given time. The
	 * 4th argument is the number of seconds to add to the given time to find
	 * the future time. If the values for h, m, and s are not valid, an error
	 * message should be printed as "Invalid time input". If the 4th argument is
	 * negative, it should be converted into it's absolute value.
	 */
	public static void time(int h, int m, int s, int g) {

		int x;
		if (h > 24 || m > 60 || s > 60) {
			System.out.println("invalid time");

		}
		if (g < 0) {
			
			x = s - g;
			if (x > 60) {
				s = x % 60;
				m += (x / 60);
				if (m > 60) {
					m = m % 60;
					h += m / 60;
				}
			}
		}
		else{
			x = s + g;
			if (x > 60) {
				s = x % 60;
				m += (x / 60);
				if (m > 60) {
					m = m % 60;
					h += m / 60;
				}
			}
		}
		System.out.println(+h + ":" + m + ":" + s);
	}

	public static void main(String[] args) {
		int hrs = 11, min = 9, sec = 23, ex = 60;
		time(hrs, min, sec, ex);
	}
}
