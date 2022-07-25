package AccessModifier2;

import AccessModifier1.Car;

public class Bike {
	
	//Different package non subclass Car class not extending

	public static void main(String[] args) {

		Car c = new Car();
		c.color = "yellow";// Public 
		

	}

}
