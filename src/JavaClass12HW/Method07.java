package JavaClass12HW;

public class Method07 {
/*
 * 
 * 
 */
	
	char getGrade(int score) {
		
		char grade;
		if (score>90) {
			grade='A';
			
		}else if(score>80) {
			grade ='B';
		}else if(score>70) {
			grade='C';
			
		}else if(score>50) {
			grade='D';
		}else {
			grade='f';
		}
		return grade;
	}
}
