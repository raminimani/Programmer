package com.syntax.class2;

import java.util.Scanner;

public class ScannerTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your name");
		
		String name=scan.next();
		
		System.out.println("hello "+name);
		
		System.out.println("Please enter your age");
		int age=scan.nextInt();
		
		System.out.println(name+" you are "+age+" years old");
		
		
	}

}
