package com.project.euler;

public class HighlyDivisibleTriangularNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*term 1 - 1*1;
		term 2 - 2*1.5
		term 3 - 3*2.0
		term 4 - 4*2.5
		.....
		.....
		Hence, using a variable j to multiply term with j to give the triangular number
		*/
		
		int i=1, k, count=2, number=500;
		double term=0;
		double j=1.0;
		
		outer:
		while(i>=1){
			
				count=2;
				term = i*j;
				i++;
				j=j+0.5;
				for(k=2; k<=term/2; k++){
					if(term%k == 0){
						count++;
					}
					if(count == number){
						break outer;
					}
				}//for loop end	
		}// end of while loop
		System.out.println("The first triangular number with about 500 divisor's is "+(int)term);
		
	}

}
