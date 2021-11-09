package JavaClass13HW;

public class StringHW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Create a String and if the String is not empty perform 
		the following: if the String has an odd number of characters 
		and has 3 or more characters, print the character in the 
		middle of the String.  */

		String name="";
		
		 if(!name.isEmpty()) {
			 if(name.length()>=3 && name.length()%2==1) {
				
				System.out.println(name.charAt(name.length() / 2));
			 }else {
				 System.out.println("The name character should be odd and not less than 3 character");
			 }
		 }else {
			 System.out.println("Please put a name in the name box, empty box is not acceptable");
		 }
		
	}

}
