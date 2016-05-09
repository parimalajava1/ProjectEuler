package com.project.euler;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a=0, b=1, t=0, sum=0;
		
		long n=4*1000*1000;
		
		while(b<n)
		{
			t = b;
			b = b+a;
		
				if(b%2 == 0){
					sum = sum+b;
				}
			
			a = t;
		}
		System.out.println("Sum of even values of fibonacci series under 4,000,000 is "+sum);

	}

}
