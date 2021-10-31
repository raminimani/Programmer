package com.syntax.class2;

import java.util.Scanner;

public class LogicalTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner height=new Scanner (System.in);
		
		System.out.println("Please enter your Height");
		
		double inch=height.nextDouble();
		
		if(inch>=0 && inch<60) {
			
			System.out.println("Your Height is short");
			
		}else if (inch>=60 && inch<=72) {
			
			System.out.println("Your Height is Medium");
			
		}else {
			
			System.out.println("Your Height is taller");
			
		}
	}

}
