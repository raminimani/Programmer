package com.syntax.class2;

import java.util.Scanner;

public class ScannerTask5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner user=new Scanner(System.in);
		
		System.out.println("Excuse me Sir/Madam, Do you have a Credit card ?");
		
		String answer=user.next();
		
		if (answer.equals("no")){
			
			System.out.println("Okay no problem we will offer you a new Credit card");
			
		}if(answer.equals("yes")) {
			
			System.out.println("What's the Balance on your card Please ?");
			
		}
		double amount=user.nextDouble();
		
		if(amount<1000) {
			System.out.println("Please pay of the money immediately ");
			
		}else {
			System.out.println("You can spend more money");
			
		}
		
	}

}
