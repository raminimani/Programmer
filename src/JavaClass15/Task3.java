package JavaClass15;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="This is Lubo. Lubo is break manager.";
		System.out.println(str.replace("Lubo", "Sorbon"));
		System.out.println(str.replaceAll("Lubo", "Sorbon"));
		
		String str2="kajdfkjASASDB1234$%^*&*(";
		System.out.println(str2.replaceAll("[^A-Za-z0-9]", ""));
		System.out.println(str2.replace("[^A-Za-z0-9]", ""));
		
		String str3="";
		//String is not recommended because every time it will search the memory and that will slow down the code
		for(int i=0;i<5;i++) {
			str3=str3+i;
		}
		
		System.out.println(str3);
		
		//When you have to change the value of a String variable always use StringBuilder class
		StringBuilder stringBuilder= new StringBuilder();
        for(int i=0;i<5;i++) {
        	stringBuilder.append(i);
        }
        System.out.println(stringBuilder);
        String str4="Me: Look it's not you it's me, walking away)";
        StringBuilder strBuilder=new StringBuilder(str4);
        strBuilder.reverse();
        System.out.println(strBuilder);
        str4=strBuilder.toString();
        
	}

}
