package oop_Encapsulation;

public class AmazonTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		lp.setUserName("admin@gmail.com");
		lp.setPassword("admin@123");
		
		lp.login(lp.getUserName(), lp.getPassword());//Login with: admin@gmail.com:admin@123
		
		lp.setPassword("admin456");
		lp.login(lp.getUserName(), lp.getPassword());//Login with: admin@gmail.com:admin456

		LoginPage lp1 = new LoginPage();
		lp.login(lp1.getUserName(), lp1.getPassword());//Login with: null:null
	}

}
