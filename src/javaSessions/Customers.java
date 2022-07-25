package javaSessions;

public class Customers {
	
	String name;
	int id;
	static String city = "Bangalore";
	static String paymentMethod = "CC";
	
	public void getInfo() {
		System.out.println("get info...");
	}
	
	public static void sendMail() {
		System.out.println("Send mail....");
	}

	public static void main(String[] args) {
		
		Customers obj = new Customers();
		
		//How to call static methods:
		//1. call directly:
		sendMail();
		obj.getInfo();
		
		//2. using class name:
		Customers.sendMail();// best way to use 
		
		//3. Using obj refe:
		obj.sendMail();// not the best way
		
		

	}

}
