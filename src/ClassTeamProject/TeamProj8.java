package ClassTeamProject;

import java.util.Scanner;

public class TeamProj8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a Java Program to print the first 10 numbers of Fibonacci series.
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Please enter your first number");
		
		int n1=scan.nextInt();
		
		System.out.println("Please enter your Second number");
		
		int n2=scan.nextInt();
		
		System.out.println("Please enter to which number you want to count");
			
		int cnt=scan.nextInt();
		
		int n3;
		int x;
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(x=2;x<cnt;++x)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
			

	}

}
