package com.brillio.training.programs;



public class Program04 {

	public static void main(String[] args) {
		//array of 4 string
		String[] names={"jones","miller","Scott","Allen"};
		//enhanced for loop(for-each loop)
		//introduced in java 1.5
		for(String name:names)
		{
			System.out.println(name);
		}
	}
	
}
