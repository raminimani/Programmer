package com.syntax.class2;

public class ifcase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int	age=18;
	double weight=110;
	
	if(age>=18) {
	System.out.println("You are eligible to donate your blood");
		if (weight>110) {
			System.out.println("you are eligible");
			}else {
				System.out.println("but you weight is over our creteria, we cannot accept such a patient");
		}
	}else {
		System.out.println("You are not eligible to donate your blood");
	}
		
	}

}
