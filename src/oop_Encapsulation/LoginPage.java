package oop_Encapsulation;

public class LoginPage {
	
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void login(String userName, String password)
	{
		System.out.println("Login with: "+ userName+":"+password);
	}
	

}
