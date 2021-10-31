package com.syntax.class2;

import java.util.Scanner;

public class ScannerTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner score=new Scanner (System.in);
		
		System.out.println("Please Enter your Quiz Score !");
		
		double quiz=score.nextDouble();
		
		System.out.println("Please Enter your Mid-Term Score !");
		
		double mid=score.nextDouble();
		
		System.out.println("Please Enter your Final Score !");
		
		double finals=score.nextDouble();
		
		double Averagescore=(quiz+mid+finals)/3;
		
		String Grade;
		
		if(Averagescore>=90) {
			Grade="A";
			
		}else if(Averagescore>=70 && Averagescore<90) {
			Grade="B";
			
		}else if(Averagescore>=50 && Averagescore<70) {
			Grade="C";
			
		}else {
			Grade="F and you're Failed, Please study hard";
			
		}
		
		System.out.println("You Have achieved Grade "+Grade);
		
		
		
	}

}
