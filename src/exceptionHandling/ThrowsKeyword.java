package exceptionHandling;

public class ThrowsKeyword {
	
	// Exception cannot be handled by throws keyword
	// throws keyword is used after the method name
	// JVM cannot handle exception which is being thrown from main method it will just print the exception encountered 
	// Throws keyword is used to pass the exception it will not handle the exception, Exception can be handled only by try-catch only
	
	
//	public void m1() throws ArithmeticException {
//		System.out.println("m1");
//		m2();
//	}  
//	public void m2() throws ArithmeticException {
//		System.out.println("m2");
//		m3();
//	}
//	public void m3() throws ArithmeticException {
//		System.out.println("m3");
//		int i=9/0;
//	}
//	
//
//	public static void main(String[] args) throws ArithmeticException {
//		
//		ThrowsKeyword obj = new ThrowsKeyword();
//		obj.m1();
//		System.out.println("Bye...");
//		
//		
//
//	}
	
	// Above code is not the correct way write the code the exception should be handled properly 
	
	public void m1()  {
		System.out.println("m1");
		m2();
	}
	public void m2()  {
		System.out.println("m2");
		
		try {
			m3();
		} catch (ArithmeticException e) {
			System.out.println("AE is coming...");
			e.printStackTrace();
		}
	}
	public void m3() throws ArithmeticException {
		System.out.println("m3");
		int i=9/0;
	}
	

	public static void main(String[] args) {
		
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();
		System.out.println("Bye...");
		
		

	}
	

}
