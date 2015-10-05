package com.brillio.training.programs;

import com.brillio.training.entity.Person;

public class Program06 {

		public static void main(String[] args) {
			Person p1=new Person(777,"john","newyork");
			
			Person[] persons={
					new Person(),
					new Person(778,"robert","bangalore"),
					new Person(779,"smith","chennai"),
					p1
			};
			
			
			}
		}
