package com.project.euler;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 600851475143L;
		long x = 0L, j=0L;
		//long count = 0L;
		
		int factor=0;
		
		x=n/2;
		
		for(long i=x; i>0 ;i--){
			factor = 0;
			for(j=2; j<i; j++){
				if(i%j == 0){
					factor++;
				}
				
				if(factor >=1){
					j=2;
					break;					
				}
			}
			if(n%i==0 && factor==0){
				System.out.println(i);
				break;
			}
			
		}
		

	}

}
