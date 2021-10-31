package com.syntax.class2;

import java.util.Scanner;

public class Scannerclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner loan=new Scanner(System.in);
		System.out.println("How much loan do you want Sir");
		
		int amt=loan.nextInt();
		
		if (amt<=200000) {
			System.out.println("We are ready to give you the loan with mentioned amount Sir");
			
		}else {
			System.out.println("Unfortunately we are unable to process your loan Sir");
			
		}
	}

}
