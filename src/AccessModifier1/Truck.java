package AccessModifier1;

public class Truck {

	// Same package non - sub class it is not extending Car class 
	public static void main(String[] args) {
		
		Car c = new Car();
		c.name = "Truckcar";// default
		c.color = "white";// public
		c.price = 1234;// protected
		

	}

}
