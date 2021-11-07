package JavaClass12;

public class Method4Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Method4 scan=new Method4();
		
		String name=scan.method1();
		System.out.println(name);
		System.out.println(scan.method2("Ramin"));
		//System.out.println(scan.method3());
		scan.method3();
		scan.method4("Afghan");
		System.out.println(scan.method5(name));
		
	}

}
