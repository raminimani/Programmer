package com.syntax.class2;

import java.util.Scanner;

public class CalculatorTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your first number");
		
		double num1=scan.nextDouble();
		
		System.out.println("Please enter your second number");
		
		double num2=scan.nextDouble();
		
		System.out.println("Please add your operator +,-,*,/");
		
		String opt=scan.next();
		
		if(opt.equals("+")) {
			System.out.println("The sum of two number is "+(num1+num2));
		}else if (opt.equals("-")) {
			System.out.println("The subtract of two number is "+(num1-num2));
		}else if (opt.equals("*")) {
			System.out.println("The multiplication of two number is "+(num1*num2));
		}else if (opt.equals("/")) {
			System.out.println("The division of two number is "+(num1/num2));	
		}else {
			System.out.println("The operation is Invalid");
		}
		
		
	}

}
