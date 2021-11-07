package JavaClass13;

import java.util.Scanner;

public class UserAndPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * Accept username, password and confirm password from a user and check following requirements:
         * Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
         * Password should be minimum 8 characters, if less → message=”Password is too short”.
         * Password cannot contain username if so, → message=”Password cannot contain username”.
         * Password should match confirmed password, if not  → message=“Passwords do not match”.
         * Only after all requirements met → message “Your username and password has been created”
		 * 
		 */

		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter your Username");
		String user=scan.nextLine();
		System.out.println("Please Enter your Password");
		String pass=scan.nextLine();
		
		if(user.isEmpty() && pass.isEmpty()) {
			System.out.println("User cannot be empty");
		}else if(pass.length()<8) {
			System.out.println("Password can not be less than 8 character");
		}else if (pass.contains(user)) {
			System.out.println("Password can not be contain Username");
		}else {
			System.out.println("You have created the User and Password successfully");
		}
		
	}

}
