package JavaClass14;

import java.util.Arrays;

public class StringDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Today is Tuesday. Today we have Java Class?";
		String[] strArr=str.split("[.]");
		System.out.println(Arrays.toString(strArr));

	}

}
