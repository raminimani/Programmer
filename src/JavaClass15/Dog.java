package JavaClass15;

public class Dog {


	String name; // instance variable
	String color;
	static int noOfLegs=4;
	
	void sleep() {
		
		int time =3;
		System.out.println(time);
		System.out.println(name+" is sleeping");
	}
	
	void eat() {
		//System.out.println(time);//can not used outside of sleep method
		System.out.println(name+" can eat");
	}
}
