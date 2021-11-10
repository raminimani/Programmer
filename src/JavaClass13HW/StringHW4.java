package JavaClass13HW;

public class StringHW4 {

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
		
		String fathersName="Daniel"; //7/2=>3
		String mothersName="Mary"; //2
		String isBoyGirl="girl";
		if(isBoyGirl.equalsIgnoreCase("Boy")) {
			String firstPart=fathersName.substring(0,fathersName.length()/2);
			String secondPart=mothersName.substring(mothersName.length()/2);
			System.out.println(firstPart+secondPart);
		}else {
			String firstPart=mothersName.substring(0,fathersName.length()/2);
			String secondPart=fathersName.substring(mothersName.length()/2);
			System.out.println(firstPart+secondPart);
		}

	}

}
