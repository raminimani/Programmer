package JavaClass15;

public class syntaxStudents {

	static String school="Syntax";
	static int durationOfCourse=6;
	
	String name;
	String id;
	
	void calculateFee() {
		
		int currentMonth=3;
		double tax=.10;
		System.out.println(name+" has to pay "+currentMonth*1000+1000*tax);
	}
}
