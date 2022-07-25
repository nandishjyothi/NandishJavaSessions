package javaSessions;

public class TestBlock {

	static {
		System.out.println("Static Block");
	}
	
	public static void test() {
		System.out.println("Static method test");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main Method");
		test();
		{
			System.out.println("Default block or instance block");
		}
		
		
	}

}
