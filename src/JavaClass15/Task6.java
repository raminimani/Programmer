package JavaClass15;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//swap names

		String str="Hormat";
		String str2="sorban";
		
		str=str+str2;
		str2=str.replace(str2, " " );
		str=str.replace(str2, " " );
		
		System.out.println(str);
		System.out.println(str2);
		
	}

}
