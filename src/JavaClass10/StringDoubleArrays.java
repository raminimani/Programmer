package JavaClass10;

public class StringDoubleArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a 2D array in which first array will consist of 4 names and second array will contain grades. 
		//Then your program should print name of the students that has A and B grade
		
		String [][] name= {
				
				{"John","Michiel","Smith","Robbin"},
				{"A","B","C","D"}
		};
		
		System.out.println("The list of Students with thier grades are as below:");
		System.out.println(name[0][0]+" "+name[1][0]);
		System.out.println(name[0][1]+" "+name[1][1]);
		System.out.println(name[0][2]+" "+name[1][0]);
		System.out.println(name[0][3]+" "+name[1][1]);
	}

}
