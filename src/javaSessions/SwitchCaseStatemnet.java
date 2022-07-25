package javaSessions;

public class SwitchCaseStatemnet {

	public static void main(String[] args) {
		
		String browser = "chrome";
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "IE":
			System.out.println("launch IE");
			break;

		default:
			System.out.println("Please Pass the right browser name");
			break;
		}
		
		// Numeric values 
		int marks = 90;
		
		switch (marks) {
		case 100:
			System.out.println("GRADE A");
			break;
		case 90:
			System.out.println("GRADE B");
			break;

		default:
			System.out.println("FAIL");
			break;
		}
		
		//Boolean value
		
	/*	Switch-case is not applicable for boolean expressions
	 * int num = 10;
		switch (num<=10) {
		case 10:
			
			break;

		default:
			break;*/
		}
		
		

	}


