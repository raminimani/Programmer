package com.syntax.class2;

import java.util.Scanner;

public class LogicalTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner week=new Scanner (System.in);
				
				System.out.println("Please enter the Week days");
				
				int weekday=week.nextInt();
				
				if(weekday>=1 && weekday<=5) {
					
					System.out.println("Today is the Week day");
					
				}else if (weekday>=6 && weekday<=7) {
					
					System.out.println("Today is weekend");
					
				}else {
					
					System.out.println("Invalid day");
				}
	}

}
