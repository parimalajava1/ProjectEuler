package com.project.euler;

public class SpecialPythagoreanTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

		//The first triplet is 3,4,5. So, skipping a value for 3, and starting from 4
		int a = 4, b = a, c = b;
		int total=1000;
		
		long product;
		
		//Rule 1: for every triplet a,b,c (a<b<c); c is never greater than a*a
		int ASq = a*a;
		
		int test = a*a + b*b;
		
		outer:
		while(a<total/2){
			
			for(b=a+1; b<ASq ;b++){
			
				test= a*a + b*b;
				
				inner: 
				for(c=b+1; c<ASq ;c++){
					
	//if c*c is > test (a*a+b*b), there is no need to iterate - reducing the number of iterations
					if(c*c>test){
						break inner;
					}
					
					if(c*c == a*a+b*b){
						if(a+b+c == total){
							System.out.println(" "+a+" "+b+" "+c);
							break outer;
						}//inner f
					}//outer f
				
				ASq = a*a;
				//test = a*a + b*b;
					
				}//inner for loop
				
			}//outer for loop
			a++;
		}// 1st while loop
		product = a*b*c;
		System.out.println("The product of a,b,c is "+product);
	}
	
}

