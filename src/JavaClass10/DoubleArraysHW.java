package JavaClass10;

public class DoubleArraysHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][] foods= {
				
				{"Onion","Potato","Garlic","Tomato","Pepper","Cucumber","Carrot"},
				{"Grapes","Orange","Banana","Apple","Mango"},
				{"Apple Pie","Cake","chocolate"},
				{"Milk","cheese","butter","yogurt"}
				
		};
		
		for (int a=0; a<foods.length; a++) {
			for (int x=0; x<foods[a].length; x++) {
				
				System.out.print(foods[a][x]+" ");
				
			}
		System.out.println();
		
		}
		
	}

}
