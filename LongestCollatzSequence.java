package com.project.euler;

public class LongestCollatzSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long chain = 0, count = 0;
		long flag = 0, largest = 0;
		
		for(int n=13 ; n<1000000 ; n++){
			
			count = 0;
			chain = n;
			
			while(chain!=1){
				if(chain%2 == 0){
					count++;
					chain = chain/2;
				}
				else{
					count++;
					chain = (3*chain)+1;
				}
			}//end of while
			
			if(count>flag){
				flag = count;
				largest = n;
				System.out.println(" "+flag);
			}
			
		}//end of for
		
		System.out.println(" "+largest);
	}

}
