package com.syntax.class2;

import java.util.Scanner;

public class ScannerNewTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner month=new Scanner(System.in);
		
		System.out.println("What is your month of birth");
		
		String date=month.next();
		
		String season;
		
		if(date.equalsIgnoreCase("January") || date.equalsIgnoreCase("February") || date.equalsIgnoreCase("March")) {
			season="Winter";
			
		}else if(date.equalsIgnoreCase("April") || date.equalsIgnoreCase("May") || date.equalsIgnoreCase("June")) {
			season="Spring";
			
		}else if(date.equalsIgnoreCase("July") || date.equalsIgnoreCase("Augest")  || date.equalsIgnoreCase("September")) {
			season="summer";
			
		}else if(date.equalsIgnoreCase("October") || date.equalsIgnoreCase("November") || date.equalsIgnoreCase("December")) {
			season="Falls";
			
		}else {
			season="Unknown";
	
		}
		System.out.println("You are born in "+season+" season");
		
		
	}

}
