package com.project.euler;

public class Prime10001st {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int count=0, pcount=10001;
long prime=0;

//as we know that 2 is a prime, to reduce the iterations,  starting with i as 3
	outer:
	for(long i=3; ;i++){
	  count=0;                                                                                                
		inner:
		for(long j=i/2;j>1;j--){
			if(i%j==0){
				count++;
			}
			if(count>=1){
				j=i/2;
				break inner;
			}
		}//end of inner loop
		if(count==0){
			prime=i;
			pcount--;
		}
		//count is set to 1 instead of 0, as we have removed 2 from i in the iterations which is also a prime
		if(pcount==1){
			System.out.println("The 100001st prime number is "+prime);
			break outer;
		}		
		
	}//end of outer for
	
		
	}

}
