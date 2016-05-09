package com.project.euler;

public class SummationOfPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//n & i for loop traversal
		//sum to hold the sum of prime numbers
		//half to reduce the inner loop iterations /2
		long n, i, total=2000000L, sum=0L, half;
		int count=0;
		
		for(n=2L; n<total; n++){
			half=n/2;
			for(i=half;i>1;i--){
				if(n%i==0){
					count++;
					break;
				}
			}//inner for loop
			if(count==0){
				System.out.println(" "+n);
				sum=sum+n;
			}
			count=0;
		}// outer for loop
	System.out.println("sum of the primes is "+sum);
	}

}
