package oop_Abstract;

public class AmazonTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		lp.title();
		lp.url();
		lp.header();
		lp.doLogin("admin", "admin");
		System.out.println();
		
		HomePage hp = new HomePage();
		hp.title();
		hp.header();
		hp.url();
		hp.logout();
		
		System.out.println();
		
		//Page p = new Page(); // cannot create object for the abstract class
		
		//Top Casting:
		// child class object can be referred by parent abstract class reference variable
		Page p = new LoginPage();
		p.title();
		p.url();
		p.header();
		//p.dologin(); not able to access due to reference type check is failed 
		p.logo();
		
		//Down casting: compile time not allowed 
		//LoginPage l1 = new Page();
		

	}

}
