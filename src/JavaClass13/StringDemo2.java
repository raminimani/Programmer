package JavaClass13;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="";
		System.out.println(name.isEmpty());
		name="Silva";
		System.out.println(name.isEmpty());
		
		System.out.println("**************");
		
		String name1=" ";
	//	System.out.println(name1.isBlank());//this gives error in JAVA 8 but works in JAVA V15 over
		System.out.println(name1.isEmpty());
		
		String str="     Batch 11 is...     ";
		System.out.println(str.trim());
		
		String str2="This is an easy class";
		System.out.println(str2.startsWith("T"));
		System.out.println(str2.startsWith("M"));
		System.out.println(str2.endsWith("class"));
		System.out.println(str2.endsWith("x"));
		System.out.println(str2.toLowerCase().endsWith("s"));
	}

}
