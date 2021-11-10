package JavaClass14;

public class StringDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="lsdfksklfkf34-053453043xcmzx,cm,fjszm,czfjew34-5@#&*#$&*&*vsm,vm,v";
		System.out.println(str.replaceAll("[0-5]", "*"));
		System.out.println(str.replaceAll("[a-z]", "*"));
		System.out.println(str.replaceAll("[A-Z]", "*"));
		System.out.println(str.replaceAll("[A-Za-z]", "*"));
		System.out.println(str.replaceAll("[A-Z]", "*").replaceAll("[a-z]", "*"));
		System.out.println(str.replaceAll("[^A-Za-z0-9]", "*"));
		System.out.println(str.replaceAll("[0-9]", ""));
		
	}

}
