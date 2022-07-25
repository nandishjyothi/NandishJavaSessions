package oop_Abstract;

public class HomePage extends Page {

	@Override
	public void title() {
		System.out.println("Home -- title");
		
	}

	@Override
	public void url() {
		System.out.println("Home -- url");
		
	}
	
	// normal method in the abstract class is override in the child class 
	@Override
	public void header() {
		System.out.println("Home -- header");
	}
	
	public void logout() {
		System.out.println("Homr -- logout");
	}
	
	

	
}
