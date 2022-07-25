package superKeyword;

public class LoginPage extends Page{
	
	int timeOut = 200;
	
	public LoginPage() {
		// inside child class constructor we cannot have 2 super statements 
		// (super)Constructor call must be the first statement in a constructor
		// super keyword will decide which parent class constructor to be called 
		// super is always representing the parent class object not parent class 
		// this keyword represents current class 
		
		super(10);
		System.out.println("Login Page default constructor...");
	}
	
	
	public void loginInfo() {
		System.out.println("Login Info method");
		// parent method can be called directly
		super.display();// parent 
		display();// child
		
	}
	
	@Override
	public void display() {
		System.out.println("LoginPage display");
		// after overriding if we want to access the parent method then we can use super keyword 
		super.display();// parent method will be picked up and not the overridden method in the child class 
		
	}
	
	public void getTimeOut() {
		System.out.println(timeOut);
		// if you want to get the parent variable (timeOut)(same variable declared in child class also) then we can use super keyword to access the value
		System.out.println(super.timeOut);
		
	}

}
