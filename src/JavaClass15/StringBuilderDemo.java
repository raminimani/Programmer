package JavaClass15;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str3="";
		
		for (int i=0; i<5; i++) {
			str3=str3+1;
		}
		System.out.println(str3);
		
		StringBuilder stringBuilder=new StringBuilder();
		
		for (int i=0; i<5; i++) {
			stringBuilder.append(i);
		}
		
		
		String str4="Hi this is Ramin hope you are fine";
		
		StringBuilder strBuilder=new StringBuilder(str4);
		
		strBuilder.reverse();
		System.out.println(strBuilder);
		str4=strBuilder.toString();
		

	}

}
