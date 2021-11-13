package JavaClass15HW;

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee obj=new Employee();
		Employee obj1=new Employee();
		obj.empID="SDT0045";
		obj1.empID="SDT0056";
		obj.salary=95000;
		obj1.salary=100000;
	
		System.out.println("Employee "+obj.empID+" has a salary of "+obj.salary+ " which is employeed by "+obj.CEO);
		
		
		System.out.println("Employee "+obj1.empID+" has a salary of "+obj1.salary+ " which is employeed by "+obj1.CEO);
	}

}
