package JavaClass13;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name=new String ("Ramin");
		String name1="Ramin";
		System.out.println(name.length());
		System.out.println(name1.toUpperCase());
		System.out.println(name.toLowerCase());
		
		String str="This is easy 1234456 %$#@!~";
		System.out.println(str.toLowerCase());
		
		System.out.println(name+name1);// recommended to use always
		System.out.println(name.concat(name1));//not recommended to use - always use + operator

	}

}
