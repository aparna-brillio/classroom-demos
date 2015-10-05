package com.brillio.training.programs;

import java.util.Arrays;

public class Program3 {

	public static void main(String[] args) {

		int[][] nums = { { 10, 20, 30 }, { 12, 123, 1234, 12345 }, { 121, 232, 343, 454 } };
		for (int i = 0; i < nums.length; i++) {
			System.out.println(Arrays.toString(nums[i]));
		}
	}
}
