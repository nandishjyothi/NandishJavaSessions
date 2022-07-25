package exceptionHandling;

public class TryCatchBlock {
	
	String name;
	

	public static void main(String[] args) {
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		//int i = 9/0;// Arithmetic exception it will not execute the below lines
		// so we can use try catch block to handle the exception
		
		TryCatchBlock obj = new TryCatchBlock();
		obj.name = "Tom";
		obj = null;
		//System.out.println(obj.name);// NullpointerException, this line is giving the exception so we can add in try block
		
		// Exception is the super class of all the exceptions (nullpointer, indexoutbound, ...)
		// Above Exception class we have Throwable class(super class)
		// Throwable class is from java.lang.Throwable package 
		// using Throwable is not a good way to use in catch block
		// Object class is the super class of all the classes in java 
		// Object class cannot be used in the catch block, catch block is not designed for object class 
		
		// if we use Exception class in the catch block all the exceptions are handled  
		// we should not use Exception class in the catch block it is ugly code 
		// always try to write possible exception that we may encounter more specific
		// always create separate catch blocks
		
		
		try {
			
			System.out.println(obj.name); // still exception occurs because arithmetic exception cannot catch nullpointerexception 
			// one try block can have multiple catch blocks, to overcome the above exception we can define one more catch block which can handle nullpointerexception
			int i = 9/0;
			// below lines are not executed   
			System.out.println("hi");
			System.out.println("hi");
			System.out.println("hi");
		}
		 catch (ArithmeticException e) {
			// catch block is executed only when there is exception in the try block
			// catch block give the info about exception
			System.out.println("ArithmeticException is coming....");
			e.printStackTrace();
		
		}
		catch (NullPointerException e) {
			System.out.println("NPE is coming....");
			e.printStackTrace();
		}
//		catch(Throwable e) { // ugly code to write 
//			System.out.println("Some exception");
//			e.printStackTrace();
//		}
//		catch(Error e) { // ugly code to write 
//			System.out.println("Some exception");
//			e.printStackTrace();
//		}
			
		
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
		
		
		// Error:
		// Under Throwable class we have 2 classes Exception class and Error class
		// Error is coming because of the system ram is full.. errors are limited 
		// Exceptions are common, it is coming because of the code we have written 
		// we can write error class in catch block but it is very rare 
		
		

	}

}
