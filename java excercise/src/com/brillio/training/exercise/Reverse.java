package com.brillio.training.exercise;

public class Reverse {
	public static void rev(int r){
	  int reverse = 0;
	 
	   while (r != 0)
	   {
	      reverse = reverse * 10;
	      reverse = reverse + r%10;
	      r= r/10;
	   }
	System.out.println("reverse of the given no. is "+reverse);  
	}
	public static void main(String[] args) {
		int n=-123;
		rev(n);
	}
}
