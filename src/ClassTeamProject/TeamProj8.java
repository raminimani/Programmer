package ClassTeamProject;

import java.util.Scanner;

public class TeamProj8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a Java Program to print the first 10 numbers of Fibonacci series.
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Please enter your first number");
		
		int num1=scan.nextInt();
		
		System.out.println("Please enter your Second number");
		
		int num2=scan.nextInt();
		
		System.out.println("Please enter to which number you want to count");
			
		int cnt=scan.nextInt();
		
		int num3;
		int x;
		 System.out.print(num1+" "+num2);//printing 0 and 1    
		    
		 for(x=2;x<cnt;++x)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  num3=num1+num2;    
		  System.out.print(" "+num3);    
		  num1=num2;    
		  num2=num3;    
		 }    
			

	}

}
