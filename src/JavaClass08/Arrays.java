package JavaClass08;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an array of cars and store 6 elements into it.
		//Using 2 different loops print all values from the array.

		String [] cars= {"Bugatti","Chevrolet","Ferrari","Ford","BMW","Audi"};
		
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		System.out.println(cars[3]);
		System.out.println(cars[4]);
		System.out.println(cars[5]);
		
	System.out.println("-------------Simple way---------------");
	
		for (String y:cars) {
			System.out.println(y);
		}
	
		System.out.println("*************2nd Way*******************");
		
		for(int x=0; x<cars.length; x++) {

			System.out.println(cars[x]);
			
		}
	}

}
