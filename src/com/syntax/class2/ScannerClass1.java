package com.syntax.class2;

import java.util.Scanner;

public class ScannerClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner data=new Scanner(System.in);
		
		System.out.println("Please enter your first number");
		
		int num1=data.nextInt();
		
		System.out.println("Please enter your Second number");
		
		int num2=data.nextInt();
		
		if (num1>num2) {
			System.out.println("Your first number "+num1+" is greater than second number "+num2);
			
		}if (num1<num2){
			System.out.println("Your first number "+num1+" is smaller than second number "+num2);
		}if (num1==num2) {
			System.out.println("The numbers are equal with each other");
			
		}

	}

}
