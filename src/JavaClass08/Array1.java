package JavaClass08;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an array of animals and store 6 elements into it. 
		//Using 2 different loops print all elements from the array
		
		String animals[]=new String [6];
		
		animals[0]="Lion";
		animals[1]="Tiger";
		animals[2]="Horse";
		animals[3]="Cat";
		animals[4]="Dog";
		animals[5]="Wolf";
		
		for(int an=0; an<animals.length; an++) {

			System.out.println(animals[an]);
		}
		
		System.out.println("*************2nd Way*******************");

		for (String y:animals) {
			System.out.println(y);
		}
		
	
			
		}

}
