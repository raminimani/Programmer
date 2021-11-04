package JavaClass11;

public class Car {

	String make;
	String model;
	String color;
	int year;
	double milage;
	void moveforward() {
		System.out.println("moving forward");
	}
	
	void ApplyingBreaks() {
		System.out.println("Applying Breaks");
	}
	
	
	public static void main(String[] args) {
	
		
	Car raminCar=new Car();
	raminCar.make="Tesla";
	raminCar.model="5";
	raminCar.color="Black";
	System.out.println("Ramin Car is "+raminCar.make);
	System.out.println("Ramin Car is "+raminCar.model);
	System.out.println("Ramin Car is "+raminCar.color);

	raminCar.moveforward();
	raminCar.ApplyingBreaks();
	}
	
}
