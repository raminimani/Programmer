package com.syntax.class2;

import java.util.Scanner;

public class CalculatorSwithCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your first number");
		
		double num1=scan.nextDouble();
		
		System.out.println("Please enter your second number");
		
		double num2=scan.nextDouble();
		
		System.out.println("Please add your operator +,-,*,/");
		
		String opt=scan.next();
		
		String result;
		
		switch (opt) {
		case "+":
		result="Result is " +(num1+num2);
		break;
		
		case "-":
		result="Result is "+(num1-num2);
		break;
		
		case "*":
		result="Result is " +(num1*num2);
		break;
		
		case "/":
		result="Result is " +(num1/num2);
		break;
		
		default:
			result="Invalid";
		}
		System.out.println(result);
		
	}

}
