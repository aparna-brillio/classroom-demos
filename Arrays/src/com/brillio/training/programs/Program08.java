package com.brillio.training.programs;

public class Program08 {

	public static void main(String[] args) {
		
		//to supply command line arguments in eclipse,
		//use the menu "run"-> "run configuration.."
		//select the "arguments" tab
		//pass the values through "program arguments"
		
		//to supply double quotes as part of the input,escape them
		//for example:"5' 10\""will be accepted as 5' 10"
		
		System.out.println("there are " + args.length + "command line arguments");
		
		
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "]is " + args[i]);
		}

	}
}
