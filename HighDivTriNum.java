package com.project.euler;

public class HighDivTriNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
	   	  i - term+i = term
		  1 - 0+1	 = 1
		  2 - 1+2 	 = 3
		  3 - 3+3 	 = 6
		  4 - 6+4 	 = 10
		  ....
		  ....
		  so term = term+i
		 */

		
		int i=1, k, count=2, number=500;
		int term=0;
		
		outer:
			while(i>=1){
				
				count=2;
				term += i;
				i++;
				
				for(k=2; k<=term/2; k++){
					if(term%k == 0){
						count++;
					}
					if(count == number){
						break outer;
					}
				}//for loop end	
				
			}//while loop end
		System.out.println("The first triangular number with about 500 divisor's is "+term);
	}

}
