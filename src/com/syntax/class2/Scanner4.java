package com.syntax.class2;

import java.util.Scanner;

public class Scanner4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner (System.in);
		
		System.out.println("Please enter the city name");
		
		String name=input.nextLine();
		
		System.out.println("Plese enter the Temperature for today");
		
		double temp=input.nextDouble();
		double conv=((temp-32)*5/9);
		
		System.out.println("The Temperature in "+name+" is "+temp+" F and "+conv+ " Celcius");
		
	}

}
