package com.syntax.class2;

import java.util.Scanner;

public class SwitchTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your Grade");
		
		String grade=scan.next();
		
		String perf;
		
		switch (grade) {
		
		case "A":
			perf="Excellent";
			break;
		case "B":
			perf="Good";
			break;
		case "C":
			perf="fair";
			break;
		case "D":
		perf="Try again harder";
		break;
		default:
			perf="you're failed";	
		
		}
		if(!perf.equals("you're failed")){
				System.out.println("You're Grade is "+grade+" and your performance is "+perf);
	}else {
		System.out.println("You're Failed try again");
	}
	
	}
}
