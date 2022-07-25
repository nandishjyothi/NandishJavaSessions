package AccessModifier1;

public class Car {
	
	// same rules applied for methods also
	// Same class:
	String name;// default
	public String color;
	protected int price;
	private int licenseNumber;
	

	public static void main(String[] args) {
		
		Car c = new Car();
		c.name = "BMW";
		c.licenseNumber = 123;
		System.out.println(c.licenseNumber);
		
		//public int i = 10;// Access modifiers are only for class variables and not for the local variables 
		// static variable also not allowed in local variable
		// only final is allowed 
		
		

	}

}
