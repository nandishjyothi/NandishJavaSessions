package javaSessions;

public class IfElseConditions {

	public static void main(String[] args) {
		 
		int a = 20;
		int b = 20;
		
		if(a>b)
		{
			System.out.println("a is greater than b");
			
		}
		else 
		{
			System.out.println("b is gr than or eq to a");
		}
		
		if(a==b)
		{
			System.out.println("both are equal");
		}
		
		//Dead code:
		if(true) {
			System.out.println("hi");
		}
		else {
			System.out.println("bye");
		}
		
		boolean flag = true;
		if(flag)
		{
			System.out.println("pass");
		}
		else {
			System.out.println("Fail");
		}
		
		int number = 90;
		
		if(number <= 100)
		{
			if(number>=90)
			{
				System.out.println("GRADE A");
			}
			if(number >=75)
			{
				System.out.println("GRADE B");
			}
		}
		else {
			System.out.println("invalid Numebr");
		}
		
		String browser = "chrome";
		
		/*
		 * //Not a good way to write the code if(browser.equals("chrome")){
		 * 
		 * System.out.println("launch chromw"); } if(browser.equals("firefox")) {
		 * System.out.println("launch firefox"); } if(browser.equals("safari")) {
		 * System.out.println("launch safari"); } if(browser.equals("IE")) {
		 * System.out.println("launch IE"); } else {
		 * System.out.println("please pass the right browser"); }
		 * 
		 *output for the code
		 * launch chrome
		 * Please pass the right browser
		 */
		
		if (browser.equals("chrome")) {
			System.out.println("launch chrome");
		} else if (browser.equals("firefox")) {
			System.out.println("Launch firefox");
		} else if (browser.equals("safari")) {
			System.out.println("Launch safari");
		} else if (browser.equals("IE")) {
			System.out.println("Launch IE");
		} else {
			System.out.println("Please pass the right browser");
		}
		
		//in the above code if the browser value is opera which is not the correct browser 
		//then all the conditions will be checked before coming to else part if there are
		//100 conditions then no condition is satisfied then all the 100 condition will be checked
		// unnecessarily so we should use switch statement 
		
		
		//if condition ex
		
		double d1 = 12.33;
		double d2 = 12.33;
		
		if(d1 == d2)
		{
			System.out.println(" matching");
		}
		else
		{
			System.out.println("not matching");
		}
		
		boolean flag1 = true;
		
		if(!flag1)
		{
			System.out.println("BYE");
		}
		else {
			System.out.println("PASS");
		}
		
		if(browser.equals("chrome"))
		{
			System.out.println("chrome");
		}
		else if(browser.equals("chrome"))
		{
			System.out.println("chrome");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
