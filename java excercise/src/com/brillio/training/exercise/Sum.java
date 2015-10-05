package com.brillio.training.exercise;

public class Sum {

		public static int Prime(int n1,int n2){
			int flag,temp=0,sum=0;
			if(n1>n2){
				temp=n1;
				n1=n2;
				n2=temp;
			}
			if(n1<=0){
				n1=1;
			}
	  for(int i=n1+1; i<n2; ++i)
	  {
	      flag=0;
	      for(int j=2; j<=i/2; ++j)
	      {
	        if(i%j==0)
	        {
	          flag=1;
	          break;
	        }
	      }
	      if(flag==0){
	    	  sum+=i;
	      }

	  }
	  return sum;

	}
		public static void main(String[] args) {
			int p1=50,p2=-100,a;
			
			a=Prime(p1,p2);
			  System.out.println(a);
		}
}
