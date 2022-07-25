package exceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		// If we want to throw customized exception / own exception then throw keyword is used 
		// but it should be handled with try-catch block only
		
		try {
			throw new Exception("Nandish Exception");
		} catch (Exception e) {
			System.out.println("Some custome exception");
			e.printStackTrace();
		}
		
		//Practical usecase of throw keyword
		
		String data = null;
		if(data == null) {
			try {
				throw new Exception("DATA NOT FOUND EXCEPTION");
			} catch (Exception e) {
				System.out.println("DATA NOT FOUND EXCEPTION is coming....");
				e.printStackTrace();
			}
		}
		
		//in selenium 
		// in a webpage trying to find element e1
		// if element e1 is not found then selenium will throw nosuchElement exception
		// one property of the element e1 is missing then selenium will not give the exception in that case we can write 
		// throw new Exception("ELEMENTPROPERTYNOTFOUNDEXCEPTION");
		
		
		

	}

}
