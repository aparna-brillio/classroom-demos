package com.brillio.training.exercise3;

import java.util.Arrays;

public class SumOfArray {
	public static void ArrayElemenys(int[] a){
		int oddSum=0,evenSum=0;
		int[] b;
		b=new int[2];
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0){
				evenSum+=a[i];
			}
			else{
				oddSum+=a[i];
			}
			
		}
		b[0]=evenSum;
		b[1]=oddSum;
		System.out.println(Arrays.toString(b));
	}
	public static void main(String[] args) {
		int a[];
		a=new int[] {10,12,11,13,5,7,6};
		ArrayElemenys(a);
		}
	}


