package com.syntax.class2;

public class loopforshaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // how to print square 10 x 10;
		
		for (int r=1; r<=10; r++) {
			for (int c=1; c<=10; c++) {
				System.out.print(" * ");
			}
			System.out.println(" * ");
		}
		System.out.println("_________________________________");
	
	
	for (int x=1; x<=4; x++) {
		for (int y=1; y<=5; y++) {
			
			System.out.print(x+" ");
			
		}
		System.out.println();
	}
	System.out.println("------------next example--------------- ");
	
	for (int r1=5; r1>=1; r1--) {
		for (int c1=1; c1<=4; c1++) {
			System.out.print(r1+" ");
		}
		System.out.println();
	
	}
	System.out.println("*******next**********");
	
	for (int r1=5; r1>=1; r1--) {
		for (int c1=4; c1>=1; c1--) {
			System.out.print(c1+" ");
		}
		System.out.println();
	}
	System.out.println("*******@@@@@@@@@@@@@@**********");
	
	for (int r1=1; r1<=5; r1++) {
		for (int c1=1; c1<=4; c1++) {
			System.out.print(c1+" ");
		}
		System.out.println();
	}
	}

}
