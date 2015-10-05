package com.brillio.training.program;

import com.brillio.training.entity.*;

public class Program01 {
	public static void main(String[] args) {
		Customer c1 = new Customer(777, "aparna", "M");
		
		Address a1=new Address("1st cross,1st main","jaynagar","bangalore","ka","india");
		
		c1.setAddress(a1);
		c1.print();
	}
}

