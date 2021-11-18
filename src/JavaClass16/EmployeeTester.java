package JavaClass16;

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee employee=new Employee();
		employee.empId="D123";
		employee.salary=90000;
		
		Employee employee2=new Employee();
		employee2.empId="D235";
		employee2.salary=110000;
		
		System.out.println(employee.empId);
		System.out.println(employee.salary);
		System.out.println(employee2.empId);
		System.out.println(employee2.salary);
		System.out.println(employee.CEO);
		
	}

}
