package javaSessions;

import java.util.ArrayList;

public class Customer {
	
	public ArrayList<String> doSearch(String categoryName) {
		System.out.println("Searching the product: "+categoryName);
		ArrayList<String> prodList = new ArrayList<String>();
		switch (categoryName) {
		case "Apple":
			
			prodList.add("iphone 12");
			prodList.add("mackbook pro");
			prodList.add("ipad mini");
			break;
		case "Samsung":
			prodList.add("s8");
			prodList.add("samsung tablet");
			break;

		case "HP":
			prodList.add("headphone");
			prodList.add("HP laptop");
			break;

		default:
			System.out.println("Product category not found...."+categoryName);
			break;
		}
		
		return prodList;
		
	}
	
	/*
	 * requirement
	 * Write a function: launch the browser
	 * input parameter: browserName(String)
	 * return: void
	 * typical example of cross browser logic
	 */
	
	public void launchBrowser(String browserName) {
		System.out.println("The Browser name is: "+browserName);
		
		if(browserName.equals("chrome")) {
			System.out.println("Launch Chrome");
		}
		else if(browserName.equals("firefox")) {
			System.out.println("Launch FF");
		}
		
		else if(browserName.equals("Safari")) {
			System.out.println("Launch Safari");
		}
		else {
			System.out.println("Please pass the right Browser: "+browserName);
		}
		
	}
	//Assignment: Write the above function using switch case:
	
	public void launchBrowserUsingSwitch(String browserName) {
		System.out.println("The Browser Name is from switch: "+browserName);
		
		switch (browserName) {
		case "chrome":
			System.out.println("Launch Chrome");
			break;
			
		case "firefox":
			System.out.println("Launch FF");
			break;
		case "safari":
			System.out.println("Launch Safari");
			break;

		default:
			System.out.println("Please pass the right Browser: "+browserName);
			break;
		}
	}
	
	/*
	 * requirement
	 * Write a function: Register a user
	 * input parameter: fn, ln,email,ph,passw,age,dob,city,address,country
	 * Java standard is that we should not pass more than 5 parameters
	 * solution : we will pass the class object (in furthur session) 
	 */

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.launchBrowser("chrome");
		
		c1.launchBrowserUsingSwitch("chrome");
		
		
		
		ArrayList<String> appleList =  c1.doSearch("Apple");
		System.out.println(appleList.size());
		System.out.println(appleList);
		
		ArrayList<String> samsungList = c1.doSearch("Samsung");
		System.out.println(samsungList.size());
		System.out.println(samsungList);
		
		for(String e: samsungList) {
			System.out.println(e);
		}
		
		ArrayList<String> nokiaList = c1.doSearch("Nokia");
		System.out.println(nokiaList.size());
		System.out.println(nokiaList);
		
		
		
	}

}
