package JavaClass13HW;

import java.util.Scanner;

public class StringHW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Write a program that reads two people's first
			names and if they expecting boy or girl? 
			Based on the input suggests a name for a baby:
			Example Output:
			Mom’s first name? Mary
			Dad’s first name? Daniel
			Boy or Girl? boy
			Suggested baby name: DANRY
			Mom’s first name? Mary
			Dad’s first name? Daniel
			Boy or Girl? girl
			Suggested baby name: MAIEL
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter your Father's Name");
		String Fname=scan.next();
		System.out.println("Please Enter your Mother's Name");
		String Mname=scan.next();
		System.out.println("Please Enter your Gender/Boy/Girl");
		String gender=scan.next();
		String result=null;
		
		
		if (gender.equalsIgnoreCase("boy")) {
			result=Fname.substring(0,3)+Mname.subSequence(Mname.length()-2, Mname.length());
		}else if(gender.equalsIgnoreCase("girl")){
			result=Mname.substring(0,2)+Fname.subSequence(Fname.length()-3, Fname.length());
		}else {
			result="Wrong gender";
		}
		System.out.println(result);
		

	}

}
