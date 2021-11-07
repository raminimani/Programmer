package JavaClass12HW;

public class Methodlang {

       void lang(String name) {
		if(name.equalsIgnoreCase("Spanish")) {
			System.out.println("Hola");
		}else if(name.equalsIgnoreCase("German")) {
			System.out.println("Hallo");
		}else if(name.equalsIgnoreCase("English")) {
			System.out.println("Hello");
		}else if(name.equalsIgnoreCase("Persian")) {
			System.out.println("Salam");
		}else if(name.equalsIgnoreCase("French")) {
			System.out.println("Bonjour");
		}else {
			System.out.println("Invalid Name");
		}
	}
}
