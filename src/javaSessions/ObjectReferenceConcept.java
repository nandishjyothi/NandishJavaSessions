package javaSessions;

public class ObjectReferenceConcept {
	
	//Class variables and class methods are called as class data members:
	
	//class variable:
	String name;
	int age;
	
	//class method:
	public void get() {
		System.out.println("get Method");
	}

	public static void main(String[] args) {
		
		ObjectReferenceConcept obj = new ObjectReferenceConcept();
		
		/*
		 * obj = null;// not good practice to write like this, also called null reference object
		 * 
		 * obj.name = "Tom";// nullpointerexception also getting warning obj.age = 25;
		 * 
		 * System.out.println(obj.name);
		 */
		// no reference objects
		new ObjectReferenceConcept().name = "Peter";
		new ObjectReferenceConcept().age = 25;
		new ObjectReferenceConcept().get();
		
		// in the above code 3 objects get created bad way of writing code

	}

}
