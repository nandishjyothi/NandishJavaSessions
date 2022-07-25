package javaSessions;

public class Ecomm {
	
	/*
	 * Method Overloading:
	 * Within the same class, when you have number of method:
	 * 1. with the same name
	 * 2. different parameters
	 * 3. different types of parameters
	 * 4. sequence of the parameters should be different 
	 * 
	 */
	
	public void login() {// 0 parameters
		System.out.println("Default login");
	}
	
	public int login(String un, String pwd) {// 2 parameters
		System.out.println("Login with: "+un+":"+pwd);
		return 100;
	}
	
	public void login(String un, int otp) {
		System.out.println("Login with: "+un+":"+otp);
	}
	
	public void login(int otp, String un) {
		System.out.println("Login with: "+un+":"+otp);
	}
	
	public void login(String un, String pwd, String otp) {
		System.out.println("Login with: "+un+":"+pwd+":"+otp);
	}
	
	public void login(long ph, int otp) {
		System.out.println("Login with: "+ph+":"+otp);
	}
	
	public void login(int otp, long ph) {
		System.out.println("Login with: "+ph+":"+otp);
	}
	
	/*
	 * Feature name: search 
	 * Filters:
	 * 1. name
	 * 2. name, price
	 * 3. seller, name, price
	 */
	
	public void search() {

	}
	public void search(String name) {

	}
	public void search(String name,int price) {

	}
	public void search(String name, String seller, int price) {

	}
	
	//Payment:
	public void doPayment(String cc, int otp) {
		
	}
	public void doPayment(String debit, int otp, String pwd) {
		
	}
	public void doPayment(long ph, int otp) {
		
	}
	public void doPayment(long ph, int otp, String upi) {
		
	}
	
	//Uber: Booking 
	public void booking(String st, String end) {
		
	}
	public void booking(String st, String end,String carType) {
		
	}
	public void booking(String st, String end,String carType,String couponCode) {
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		
		

	}

}
