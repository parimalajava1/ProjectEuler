package com.project.euler;

public class Multiple {

	public static void main(String[] args) {
		
		int s=0;
		
		for(int n=0; n<1000; n++){
			
			if(n%3==0 || n%5==0)
				s+=n;
			
		}

		System.out.println("The sum of multiples of either 3 or 5 under 1000 is "+s);
	}

}
