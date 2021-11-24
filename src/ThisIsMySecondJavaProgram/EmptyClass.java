package ThisIsMySecondJavaProgram;

public class EmptyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String word ="abrakadabra";

	      String replace=word.replaceAll("[^aAeEiIoOuU]", " ");

	      System.out.println(replace);
	}

}
