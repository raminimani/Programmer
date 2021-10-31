package com.syntax.class2;

import java.util.Scanner;

public class ScannerTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Dmv=new Scanner(System.in);
		
		System.out.println("Welcome To Viginia DMV Services and May I have your Name please?");
		
		String name=Dmv.nextLine();
		
		System.out.println("Thank you Mr/Miss. "+name+" and May I have your age please?");
		
		int age=Dmv.nextInt();
		
		System.out.println("Thank you "+name+" , hold on let me check your eligibility for further process");
		
		if (age>=18) {
			System.out.println("Your eligible for the Driver Licence test");
			
		}else {
			System.out.println("I am sorry Sir/Madam, You are not eligible for the driving test but we recommend you for the permit");
		}
		
	}

}
