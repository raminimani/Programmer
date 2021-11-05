package ClassTeamProject;

import java.util.Scanner;

public class TeamProj7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int number=0;
		int cont=2;
		boolean pri=true;
		do {
			System.out.println("Please enter your number for checking the prime number");
			number=input.nextInt();
		}while(number<=0);
		do {
			int result=number%cont;
			cont++;
			if(result==0) {
				pri=false;
				break;
			}
		}while(cont<number);
		if(pri==false) {
			System.out.println(number+" is not a Prime number.");
		}else {
			System.out.println(number+" is a Prime number.");
		}

	}

}
