package com.syntax.class2;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//from 30 to 70 do while loop
		
		int num=30;
		
		do {
			System.out.print(num+" ");
			num++;
			

		}while (num<=70);
	
		System.out.println("***************************");
	
		// print odd numbers from 99 to 1 using do while
		
		int n=99;
		
		do {
			if (n%2==1) {
				
				System.out.print(n+" ");
			}
			n--;
			
		}while(n>=1);
		
	}

}
