package com.syntax.class2;

import java.util.Scanner;

public class SwitchTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your country");
		
		String count=scan.nextLine();
		
		String lang;
		
		switch (count) {
		
		case "Japan":
			lang="Japanise";
			break;
		
		case "USA":
			lang="English and Spanish";
			break;
		case "Germany":
			lang="Deutch";
			break;
		default:
			lang="Not in the list";
			
		}
		if(!lang.equals("Not in the list")) {
			System.out.println("The "+count+" country people speaks "+lang);
		}else {
			System.out.println("Not in the list");
			
		}
	
		
	}

}
