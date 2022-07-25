package oop_Encapsulation;

public class Browser {
	
	public void launchBrowser() {
		System.out.println("Launch Browser");
		checkVersion();
		checkOSVersion();
		checkEnoughRAM();
		System.out.println("Browser Launched");
	}
	/*
	 * ugly code bcoz end user does not require the below method so make them as private
	 * 
	 * public void checkVersion() { System.out.println("Check browser version"); }
	 * 
	 * public void checkOSVersion() { System.out.println("Check OS version"); }
	 * 
	 * public void checkEnoughRAM() { System.out.println("check Enough RAM"); }
	 */
	
	//if user wants the browser version:
	public void getBrVersion() {
		checkVersion();
	}
	
	private void checkVersion() {
		System.out.println("Check browser version");
	}
	
	private void checkOSVersion() {
		System.out.println("Check OS version");
	}
	
	private void checkEnoughRAM() {
		System.out.println("check Enough RAM");
	}

}
