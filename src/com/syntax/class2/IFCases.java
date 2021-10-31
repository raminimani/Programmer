package com.syntax.class2;

public class IFCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean Diploma=false;
		double GPAScore=2.5;
		if (Diploma) {
			System.out.println("Congratulation!");
			if(GPAScore>=3.5) {
				System.out.println("You are eligible for Scholorship");
			}else {
				System.out.println("You should have studied harder");
			}
			
		}else {
			System.out.println("Get a Degree!");
		}
	}

}
