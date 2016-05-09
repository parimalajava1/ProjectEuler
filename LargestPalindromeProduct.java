package com.project.euler;

public class LargestPalindromeProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// i and j variables for iterations; count to increment if encountered any palindrome
		int i, j, count=0;
		
		//s as a temporary variable to hold the reversed value of a number
		//p and x to hold the value of product of two 3 digit numbers
		long p,x,s=0;
		
		for(i=999; i>=100; i--){
			for(j=i; j>=100; j--){
				p=j*i;
				x=p;
				
				// while loop to check if the number is a palindrome
				while(x>0){
					s=s*10;
					s=s+x%10;
					x=x/10;
				}//end of while
				
				if(p==s){
					count++;
					System.out.println("The largest palindrome is "+s);
					break;
				}
			}//end of inner for loop
			
		}//end of outer for loop
		
		if(count==0){
			System.out.println("There is no largest palindrome with two 3 digits multiplied.");
		}
	} 

}
