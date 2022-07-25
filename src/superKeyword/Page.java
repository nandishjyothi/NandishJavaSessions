package superKeyword;

public class Page {
	
	int timeOut = 100;
	
	public Page() {
		System.out.println("Page default constructor...");
	}
	
	public Page(int a) {
		System.out.println("Page constructor..."+a);
	}
	
	public Page(int a, int b) {
		System.out.println("Page constructor..."+(a+b));
	}
	
	public void display() {
		System.out.println("Page display");
	}

}
