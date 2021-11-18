package JavaClass16;

public class AccessModifierDemo1 {

	
	private String name;
	int age;
	public double salary;
	
	void dispalyname() {
		System.out.println(name);
	}
	
	void displayAge() {
		System.out.println(age);
	}
	
	void displaySalary() {
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		
		AccessModifierDemo1 am=new AccessModifierDemo1();
				am.name="Nabil";
				am.age=22;
				am.salary=110000;
				am.dispalyname();
				am.displayAge();
				am.displaySalary();
				
				
	}
}
