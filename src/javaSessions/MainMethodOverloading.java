package javaSessions;

public class MainMethodOverloading {

	
	  public static void main(String a[]) { 
		  System.out.println(a);// random address value
		  //System.out.println("Main 1"+a[0]);// index out of bound exception
		  //String a[] is the command line argument JVM will pass 
	  
	  }
	  // allowed:
	  // or public static void main(String [] args)
	  // or public static void main(String args[])
	  
	 
	public static void main(int a) {
		System.out.println("Main 2" + a);

	}

	public static void main(int a, int b) {
		System.out.println("Main 3" + a + b);

	}
	 public static void main(String a) { 
		  System.out.println("Main 1");
	  
	  }
	

}
