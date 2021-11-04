package ClassTeamProject;

import java.util.Scanner;

public class TeamProj6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a program to swap 2 numbers without a temporary variable?
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter your First Number!");
		
		int x=scan.nextInt();
		System.out.println("Please enter your Second Number");
		
		int y=scan.nextInt();
		
	        x = x + y;
	        y = x - y;
	        x = x - y;
	        System.out.println("After swaping:"  + " x = " + x + ", y = " + y);
	        
		
	}

}
