package JavaClass15HW;

public class Students {

	
	String StuName;
	String StudID;
	static int NumOFStud=0;
	
	public static void main(String[] args) {
		
		Students Student1=new Students();
		Student1.StuName="Ramin";
		Student1.StudID="PD045";
		NumOFStud++;
		
		Students Student2=new Students();
		Student2.StuName="Nasir";
		Student2.StudID="PD0121";
		NumOFStud++;
		
		Students Student3=new Students();
		Student3.StuName="Sebastian";
		Student3.StudID="PD058";
		NumOFStud++;
		
		System.out.println(NumOFStud);
		
	}
}
