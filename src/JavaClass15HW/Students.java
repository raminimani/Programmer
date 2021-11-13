package JavaClass15HW;

public class Students {

	
	String StuName;
	String StudID;
	static int NumOFStud=0;
	
	public static void main(String[] args) {
		
		Students st1=new Students();
		st1.StuName="Ramin";
		st1.StudID="PD045";
		NumOFStud++;
		
		Students st2=new Students();
		st2.StuName="Nasir";
		st2.StudID="PD0121";
		NumOFStud++;
		
		Students st3=new Students();
		st3.StuName="Sebastian";
		st3.StudID="PD058";
		NumOFStud++;
		
		System.out.println(NumOFStud);
		
	}
}
