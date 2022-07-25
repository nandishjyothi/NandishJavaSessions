package javaSessions;

public class Employee {

	String name;
	int age;
	String city;
	double salary;
	boolean isPerm;
	char gender;
	
	// above is the class blueprint 
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		//e1 is called object reference name
		// new Employee()-> is the object
		// employee -> is the class/ type of e1
		// Employee is the non primitive data type
		
		//the moment object is created all the class variables(photo copy) are given to the new object created like 
		// (name, age, city, salary, isPerm)
		// how to access the class variable -> using the object ref name i.e e1.name ...
		
		e1.name = "Tom";
		e1.age = 25;
		e1.city = "Delhi";
		e1.salary = 12.33;
		e1.isPerm = true;
		
		System.out.println(e1.name+" "+e1.age+" "+e1.city);
		
		//we can create n number of objects obj ref cannot be used again
		
		Employee e2 = new Employee();
		e2.name = "Peter";
		System.out.println(e2.name+" "+e2.age+" "+e2.city+" "+e2.salary+" "+e2.isPerm);// default values will be printed 
		//default values:
		// String - null
		// int - 0
		// double - 0.0
		// boolean - false
		// char - blank space
		
		//imp interview question:
		
		
		
		
		
		
	}

}
