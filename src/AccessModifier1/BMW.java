package AccessModifier1;

public class BMW extends Car {

	//Same package sub class
	public static void main(String[] args) {
		
		Car c = new Car();
		c.name = "BMW";// default
		c.color = "RED";// public
		c.price = 123;// protected
		
		BMW b = new BMW();
		b.name = "Audi";// default
		b.color = "black";// public
		b.price = 203;// protected
		
		

	}

}
