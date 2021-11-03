package JavaClass08;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create an array to store double values and then print those in reverse order
	
	double num[] = {12.5, 14.0, 13.2 , 4.3, 17.0 };
	
	for (int z=num.length-1; z>=0; z-- ) {
		
		System.out.println(num[z]);
		
	}
	System.out.println("******************************************");
	
	//array printed by values from top to bottom
	
	Arrays.sort(num);
	for (int z=(num.length)-1; z>=0; z-- ) {
		
		System.out.println(num[z]);
		
	}
	
	}

}
