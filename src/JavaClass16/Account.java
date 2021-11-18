package JavaClass16;

public class Account {

	
	private String userName;
	private String password;
	private String name;
	private String address;
	private int age;
	private double accountBalance=15;
	
	public void setUserName(String AccountuserName) {
		if(AccountuserName.length()<16) {
			userName=AccountuserName;
		}else {
			System.out.println("UserName of this length is not allowed");
			
		}
		
	}
	
	public void setPassword(String AccountPass) {
		if(AccountPass.length()<16) {
			password=AccountPass;
		}else {
			System.out.println("Password of this length is not allowed");
			
		}
	}
	
	
public void	 getBalance(String AccountuserName,String accountPassword ) {
		
		if(userName.equals(AccountuserName) && password.equals(accountPassword)) {
			System.out.println(accountBalance);
		}else {
			System.out.println("UserName or Password is not correct");
		}
		
	}
	
}
