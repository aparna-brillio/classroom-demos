package com.brillio.training.exercise;

public class JulianDate {
	public static int calculateJulianDate(int day, int month, int year) {
		int max, jd = 0;
		max = maxDays(month, year);
		if (year <= 0) {
			return -1;
		}
		if (month < 1 || month > 12) {
			return -2;
		}
		if (day < 1 || day > max) {
			return -3;
		}

		for (int i = 1900; i < year; i++) {
			if (isLeap(i)) {
				jd += 366;
			} else
				jd += 365;
		}
		for (int j = 1; j < month; j++) {
			max = maxDays(j, year);
			jd += max;
		}
		jd += day;
		return jd;
	}

	public static int maxDays(int month, int year) {

		switch (month) {
		case 2:
			return isLeap(year) ? 29 : 28;
		case 4:
		case 6:
		case 7:
		case 9:
			return 30;
		default:
			return 31;
		}

	}

	static boolean isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}

	public static void main(String[] args) {
		int day = 13, months = 2, year = 2015, days;
		days = calculateJulianDate(day, months, year);
		System.out.println(days);
	}
}