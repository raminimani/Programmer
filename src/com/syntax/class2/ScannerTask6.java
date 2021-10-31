package com.syntax.class2;

import java.util.Scanner;

public class ScannerTask6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner data=new Scanner(System.in);
		
		System.out.println("How many years have you worked for this company ");
		
		double years=data.nextDouble();
		
		System.out.println("How mach is your current Salary?");
		
		int salary=data.nextInt();
		
		if (years>=5) {
			System.out.println("You are eligible for the bonus");
			
		}else {
			System.out.println("I am sorry you're not eligible for bonus");
			
		}if (salary>50000) {
			System.out.println("You are eligible for the 5000 bonus");
		}if(salary<50000) {
			System.out.println("You are eligible for the 3000 bonus");
		}
	}

}
