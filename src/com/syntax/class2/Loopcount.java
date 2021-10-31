package com.syntax.class2;

public class Loopcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please Print the numbers from 1 to 100");
		
		int num=1;
		
		while (num<=100) {
			
			System.out.print(num+" ");
			
			num++;
			
		}
		System.out.println("********************************************");
		
		int num1=100;
		
		while (num1>=1) {
			System.out.print(num1+" ");
			
			num1--;
			
		}
		System.out.println("*********************************************************");
		
		int num2=20;
		while (num2<=100) {
			System.out.print(num2+" ");
			num2+=2;
		}
		System.out.println("*****************************************************************");
		
		int num3=100;
		while(num3>=1) {
		if	(num3%2==1) {
			System.out.print(num3+" ");
			
		}
		num3--;	
		}	
		}

}
