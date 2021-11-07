package JavaClass12HW;

public class Method06 {

	/*
	 * 
	 * 
	 */
	
	boolean isPrime(int number) {
		boolean isPrime=true;
		if(number>1) {
			for (int i=2; i<number; i++) {
				
				if (number% i==0) {
					isPrime=false;
					break;
				}
			}
			
		}else {
			isPrime=false;
		}
		return isPrime;
	}
}
