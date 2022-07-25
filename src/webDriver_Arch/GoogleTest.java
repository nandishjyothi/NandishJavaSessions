package webDriver_Arch;

public class GoogleTest {

	static WebDriver driver;

	
	public static void main(String[] args) {
		
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		
		// what is the issue here?
		// we have to keep creating different browser object again and again 
		// so we can use top casting concept 
		
		//WebDriver driver = new ChromeDriver();
		//driver is parent interface reference variable  pointing to chrome driver object
		// here also we have comment and write for firefox driver 
		
		// In chromeDriver there are no individual methods why? because when we do top casting we cannot access individual
		// method of chromeDriver only overrided method can be accessed 
		
		// so we can write cross browser testing logic:
		// define static webdriver as class variable
		// type of the driver is WEBDRIVER
		// below code is practical example of top casting 
		
		String browser = "safari";
		
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browser.equals("safari")) {
			driver = new SafariDriver();
		}
		else {
			System.out.println("Plz pass the right browser...");
		}
		
		
		
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement();
		driver.findElements();
		
		driver.click();
		driver.sendKeys("test@gmail.com");
		driver.close();
		
		
		
		

	}

}
