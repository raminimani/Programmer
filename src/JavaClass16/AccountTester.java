package JavaClass16;

public class AccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account1=new Account();
		//account1.balance=3425534 not allowed 
		
		account1.setUserName("Ramin");
		account1.setPassword("Pass123");
		account1.getBalance("Ramin", "Pass123");
		
	}

}
