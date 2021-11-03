package JavaClass10;

public class DoubleArraysNewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create 2D array of cars : american, german, korean, italian.
		//Then retrieve all values from that array using 2 different loops

	String [][] cars= {
			
			{"American","      German       ", "          Korean   ","          Italian   "},
			{"  GMC  ",   "   Mercedes Benz     ","      Mitsubshi    ",   "       Mini Cop   "}
	};	
		
	for (String [] car:cars) {
		for (String  c:car) {
			System.out.print(c+" ");
		}
		System.out.println();
	}
	
	System.out.println("**********************************Second Way********************************************");
	
	for (int i=0; i<cars.length; i++) {
		for (int j=0; j<cars[i].length; j++) {
	
		System.out.print(cars[i][j]+" ");
		}
		System.out.println();
	}
	
	}

}
