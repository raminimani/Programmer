package com.syntax.class2;

import java.util.Scanner;

public class LogicalTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner num=new Scanner(System.in);
		
		System.out.println("Please enter your number");
	
		double numb1=num.nextDouble();
		double numb2=num.nextDouble();
		double numb3=num.nextDouble();
	
		if (numb1==numb2 && numb1==numb3) {
			
			System.out.println("The numbers are equal");
			
		}else {
			if(numb1>numb2 && numb1>numb3) {
				System.out.println("Number one is the largest number");
				
			}else if(numb2>numb3 && numb2>numb1) {
				
				System.out.println("Number two is the largest number");
				
			}else if(numb3>numb1 && numb3>numb2) {
				
				System.out.println("Number three is the largest number");
			}
		}
	}

}
