package oop_Abstract;

public class LoginPage extends Page{
	
	// in the child class we have to implement the abstract methods which is present in the abstract class
	//(Page is the parent class which is abstract class)
	// we can override normal method also in the child class 
	
	public LoginPage() {
		System.out.println("LP -- default constructor");
	}

	@Override
	public void title() {
	
		System.out.println("LP -- Title");
		
	}

	@Override
	public void url() {
		System.out.println("LP -- URL");
		
	}
	
	public void doLogin(String un, String pwd) {
		System.out.println("Login with: "+un+":"+pwd);
	}
	
	public void doLogin(String un, String pwd, long ph) {
		System.out.println("Login with: "+un+":"+pwd+":"+ph);
	}
	

	
}
