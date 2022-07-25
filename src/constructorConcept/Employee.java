package constructorConcept;

public class Employee {
	
	String name;
	int id;
	int age;
	double salary;
	boolean isPerm;
	char gender;
	
	//Constructor:
	// name of the constructor will be same as the class name
	// constructor cannot have any return type, no void , no return
	// constructor will be called when you create the object of the class
	
	// Function may or may not return value but constructor will never return any value
	// Function name can be anything, but constructor name will be same as the class name 
	// Function will have the business logic/ feature logic but constructor will be helping to create the object 
	// To call the function, we need to create the object and use object ref variable.
	// but to call the constructor just create the object and supply the values
	
	
	
	
	public Employee() {//0 parameters/default constructor
		
		System.out.println("Default constructor");
	}
	
	public Employee(int a) {// 1 parameter constructor
		System.out.println(a);
	}
	
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
		
	}
	
	public Employee(String name, int id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
		
	}
	
	public Employee(String name, boolean isPerm) {
		this.name = name;
		this.isPerm = isPerm;
		
	}

	public Employee(String name, int id, int age, double salary, boolean isPerm, char gender) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.isPerm = isPerm;
		this.gender = gender;
	}
	
//	public Employee(String name, int id, int age,double salary, boolean isPerm,char gender) {
//		this.name = name;
//		this.id = id;
//		this.age = age;
//		this.salary = salary;
//		this.isPerm = isPerm;
//		this.gender = gender;
//		
//	}
	
	// it is tedious job to write this. name ..... to write every time so shortcut for this is 
	//right click-> source-> generate constructors using fields
	
	



}
