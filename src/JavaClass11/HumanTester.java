package JavaClass11;

public class HumanTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human ramin=new Human();
		
		ramin.name="Ramin";
		ramin.age=28;
		ramin.height=5.8;
		ramin.weight=74;
		ramin.gender='M';
		ramin.bloodType="ORH+";
		
		ramin.eat();
		ramin.sleep();
		ramin.walk();
		ramin.sendMemes();
		
		System.out.println("******************************");
		
		Human Sebas=new Human();
		Sebas.name="Sebas";
		Sebas.age=18;
		Sebas.height=6.1;
		Sebas.weight=90;
		Sebas.gender='M';
		Sebas.bloodType="B+";

		Sebas.eat();
		Sebas.sleep();
		Sebas.walk();
		Sebas.sendMemes();
		System.out.println(Sebas.age);
		
		
	}

}
