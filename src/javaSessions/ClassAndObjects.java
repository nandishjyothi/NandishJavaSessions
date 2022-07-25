 package javaSessions;

public class ClassAndObjects {
	
	int i = 20;//Class variable
	//scope of the class variable is global scope i.e it can be used anywhere but there are rules
	

	public static void main(String[] args) {
		
		int i = 10;// local variable
		// Main is a method
		// scope of the local variable is inside the method only
		System.out.println(i);
		
		//how to access the class variable
		//we need to create the object for the class classandobject class
		
		ClassAndObjects obj = new ClassAndObjects();
		System.out.println(obj.i);
		
		//Class - class is the template or blueprint of the objects(human is class)(animal is template)
		//Object - object is the physical entity should be created from the class template/category (diff human created)(dog, cat etc..)
		//employee is a class and emp1, emp2 are objects
		// customer is class number of customer is object
		// booking is class, 
		// every class will have properties which will be used to create objects
		
		 
	
	}

}
