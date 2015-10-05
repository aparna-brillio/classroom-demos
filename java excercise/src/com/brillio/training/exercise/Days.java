package com.brillio.training.exercise;



public class Days {
	/*
	 * Write a Java function with 2 arguments representing month and year to
	 * return the number of days in the given month and year. If the month is
	 * invalid return -1 and if the year is invalid (year<=0) return -2.
	 */
	public static int NoOfDays(int month, int year) {
		int days=0;
		if(year<=1000)
			return -2;
		if (month <= 0 || month > 12)
			return -1;
		else if (month == 4 || month == 6 || month == 9 || month == 11) {
			days = 30;
		} else if (month == 2) {
			boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
			if (isLeapYear)
				days = 29;
			else
				days = 28;
		} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			days = 31;
		return days;
	}
	public static void main(String[] args) {
		int m=10,y=2015,a;
		a=NoOfDays(m,y);
		System.out.println("no. of days is "+a);
		
	}
}


