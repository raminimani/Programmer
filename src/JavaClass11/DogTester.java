package JavaClass11;

public class DogTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog alonaDog=new Dog();
		alonaDog.name="Lexy";
		alonaDog.breed="american hound";
		alonaDog.color="Black";
		alonaDog.height=2.5;
		alonaDog.age=10;
		alonaDog.gender='M';
		
		System.out.println("My Dog Name is "+alonaDog.name);
		System.out.println("It's breed is "+alonaDog.breed);
		System.out.println("It's color is "+alonaDog.color);
		
		
		Dog jimmysDog=new Dog();
		jimmysDog.name="Teddy";
		jimmysDog.breed="Labrador Retriever";
		jimmysDog.color="Golden";
		jimmysDog.height=5;
		jimmysDog.age=5;
		jimmysDog.gender='M';
		
		System.out.println("My Dog Name is "+jimmysDog.name);
		System.out.println("It's breed is "+jimmysDog.breed);
		System.out.println("It's color is "+jimmysDog.color);		
		
		Dog arwasDog=new Dog();
		arwasDog.name="Tiger";
		System.out.println("My Dog Name is "+arwasDog.name);

		
	}

}
