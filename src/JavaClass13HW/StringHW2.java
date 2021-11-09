package JavaClass13HW;

public class StringHW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Create a String and print it in reverse order (Sunday -/ yadnuS).

		String WD="Monday";
		String reverse = "";
		for(int i = WD.length() - 1; i >= 0 ; i--) {
			reverse = reverse + WD.charAt(i);
		}
		System.out.println(reverse);
	}

}
