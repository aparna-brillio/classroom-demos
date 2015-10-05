package com.brillio.training.exercise;

public class AscendingOrder {
	
	public static void sum(int a,int b,int c){
		int temp=0;
		if(a>b)
		{
			temp=a;
			a=b;
			b=temp;
			if(b>c)
			{
				temp=b;
				b=c;
				c=temp;
			}
			if(a>b)
			{
				temp=a;
				a=b;
				b=temp;
			}
			else if(a>c)
			{
				temp=a;
				a=c;
				c=a;
			}
		}
		
		System.out.println(+a+" "+b+" "+c);
	}
	public static void main(String[] args) {
		int x=500,y=400,z=300;
		sum(x,y,z);
		
	}
}
	
	
	