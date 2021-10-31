package com.syntax.class2;

import java.util.Scanner;

public class SwitchCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	
	System.out.println("Please put your country Name");
	
	String country=scan.nextLine();
	String food;
	
	switch(country){
	case "Afghanistan":
	food="Manto";
	break;
	
	case "Pakistan":
		food="Dal";
		break;
		
	case "USA":
		food="Burger";
		break;
		
	case "Italy":
		food="Pizza";
		break;
		default:
			food="Your country is not in this list";
			
	
	}
	if (!food.equals("Your country is not in this list")) {
		System.out.println("If your country is "+country+" your favorite food is "+food);
	}else {
		System.out.println("Your country is not in this list");
	}
	
	
	
	}

}
