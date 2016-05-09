package com.project.euler;

public class SumSquareDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;
		long x=0L, y=0L, z;
		
		for(i=2; i<=100; i++){
			z = (long) Math.pow(i, 2);
			x = x+z;
			
			y = y+i;
		}// end of for loop
		
		y=(long) Math.pow(y, 2);
		
		z=y-x;
		
		System.out.println("Difference between the squares of sum and sum of squares is "+z);
	}

}
