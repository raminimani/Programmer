package com.syntax.class2;

public class ifcases2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double morgagerate=4.4;
		int morgageprice=190000;
		
		if (morgagerate<4.5) {
			System.out.println("User will consider buying");
			if (morgageprice>200000) {
				System.out.println("The User will take loan");
			}else {
				System.out.println("User will pay Cash");
				}

		}else {
			System.out.println("User will not buy a house");
		}
	}

}
