package JavaClass13;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="This class is easy";
		System.out.println(name.contains("class"));
		System.out.println(name.contains("love"));
		System.out.println(name.contains("i"));
		
		System.out.println("********************************");
		
		String str2= "Hello";
		String str3="helwertghlo";
		System.out.println(str2.equals(str3));
		System.out.println(str2.equalsIgnoreCase(str3));
		
		System.out.println(str2.toUpperCase().charAt(4));
		System.out.println(str2.indexOf("l"));
		System.out.println(str3.indexOf('l', str3.indexOf('l')+1));
		
		System.out.println("--------------------------------");
		
		System.out.println(name.substring(5));
		System.out.println(name.substring(5,13));// starts after letter 5 and ends before letter 13
		
		
		
	}

}
