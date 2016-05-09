package com.project.euler;

public class SmallestMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//the smallest multiple evenly dividing 1-10 digits is 2520
		int count=0, i=2520, j;
		
		outer:
		while(i%2 == 0){

			for(j=20;j>=3;j--){

				if(i%j==0){
					count++;
				}//end of if
				
				//as we have deducted 1 and 2 for j from the loop
				if(count==18){
					System.out.println("The smallest multiple for first 20 digits is "+i);
					break outer;
				}//end of if
				
			}//end of for loop
			count=0;
			i=i+2;
		}//end of while loop
		
	}

}
