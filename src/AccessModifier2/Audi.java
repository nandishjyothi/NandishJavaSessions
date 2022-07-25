package AccessModifier2;

import AccessModifier1.Car;

public class Audi extends Car{
	
	//Different Package Sub class extending Car class

	public static void main(String[] args) {
	
		Audi a = new Audi();
		a.color = "blue";// public
		a.price = 2323; // protected 
		

	}

}
