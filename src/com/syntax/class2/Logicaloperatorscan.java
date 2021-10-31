package com.syntax.class2;

import java.util.Scanner;

public class Logicaloperatorscan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter today's day");
		
		String day=scan.next();
		
		if(day.equals("Monday") || day.equals ("friday")) {
			System.out.println("No class for today");
			
		}else if (day.equals("Saturday") || day.equals ("Sunday")) {
			
			System.out.println("We have Java class today");
			
		}else if (day.equals("Tuesday") || day.equals ("Wednesday")) {
			
			System.out.println("We have Manual testing class today");
		}else {
			
			System.out.println("Wrong day");
			
		}
	}

}
