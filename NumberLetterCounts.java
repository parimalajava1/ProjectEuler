package com.project.euler;

public class NumberLetterCounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberLetterCounts c = new NumberLetterCounts();
		
		int num = 0, n = 0;
		int digits = 0;
		
		for(int max = 1 ; max<=1000 ; max++){
			
			num = max;
			if(num>=100){
				
				n=num/100;
				num=num%100;
				
				digits = digits + 7;
				digits = digits + c.OneDigit(n);
			}//end of first if block
			
			if(num>=10 && num<100){
				digits = digits + c.TwoDigit(num);
			}//end of second if block
			
			if(num>0 && num<10)
			{
				digits = digits + c.OneDigit(num);
			}
			
		}//end of while
		
		System.out.println("The sum of all the digits from 1 to 1000 is "+digits);
	}//end of main
	
	int TwoDigit(int num){
		
		NumberLetterCounts a = new NumberLetterCounts();
		
		int dig = 0;
		if(num>=10 && num<20){
			if(num == 10){
				dig = dig + 3;
			}
			if(num == 11){
				dig = dig + 6;
			}
			if(num == 12){
				dig = dig + 6;
			}
			if(num == 13){
				dig = dig + 8;
			}
			if(num == 14){
				dig = dig + 8;
			}
			if(num == 15){
				dig = dig + 7;
			}
			if(num == 16){
				dig = dig + 7;
			}
			if(num == 17){
				dig = dig + 9;
			}
			if(num == 18){
				dig = dig + 8;
			}
			if(num == 19){
				dig = dig + 8;
			}
		}//end of first if
		else{
			
		if(num>=20 && num<30){
			dig = dig + 6;
			num = num%10;
			dig = dig + a.OneDigit(num);
		}
		
		if(num>=30 && num<40){
			dig = dig + 6;
			num = num%10;
			dig = dig + a.OneDigit(num);
		}
		
		if(num>=40 && num<50){
			dig = dig + 5;
			num = num%10;
			dig = dig + a.OneDigit(num);
		}
		
		if(num>=50 && num<60){
			dig = dig + 5;
			num = num%10;
			dig = dig + a.OneDigit(num);
		}
		
		if(num>=60 && num<70){
			dig = dig + 5;
			num = num%10;
			dig = dig + a.OneDigit(num);
		}
		
		if(num>=70 && num<80){
			dig = dig + 7;
			num = num%10;
			dig = dig + a.OneDigit(num);
		}
		
		if(num>=80 && num<90){
			dig = dig + 6;
			num = num%10;
			dig = dig + a.OneDigit(num);
		}
		
		if(num>=90 && num<100){
			dig = dig + 6;
			num = num%10;
			dig = dig + a.OneDigit(num);
		}
	}//end of else
		
		return dig;
}//end of twodigit method
	
	int OneDigit(int n){
		int digi = 0;
		
		if(n==1){
			digi = digi+3;
		}
		if(n==2){
			digi = digi+3;
		}
		if(n==3){
			digi = digi+5;
		}
		if(n==4){
			digi = digi+4;
		}
		if(n==5){
			digi = digi+4;
		}
		if(n==6){
			digi = digi+3;
		}
		if(n==7){
			digi = digi+5;
		}
		if(n==8){
			digi = digi+5;
		}
		if(n==9){
			digi = digi+4;
		}//end of first if block
		
		return digi;
	}

}
