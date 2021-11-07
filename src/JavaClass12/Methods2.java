package JavaClass12;

public class Methods2 {
	
	void repeatWords(String word, int times) {
		
		for (int i=0; i<times; i++) {
			System.out.println(word);
			
		}
	}
	void isItRainning(boolean isRain) {
		
		if(isRain) {
			System.out.println("Please take umbrella");
			
		
		}else {
			System.out.println("lets go for a walk");
		}
	}

}
