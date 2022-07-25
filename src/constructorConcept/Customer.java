package constructorConcept;

public class Customer {
	
	private String name; 
	private int age;
	private String comp;
	
	public Customer() {
		System.out.println("Default constructor");
	}
	
	public Customer(String name, int age, String comp) {
		this.name = name;
		this.age = age;
		this.comp = comp;
	}

	// customer constructor is helping to initialize the values but setter method is used for updating the values 
	
	//Getter and Setter:

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getComp() {
		return comp;
	}


	public void setComp(String comp) {
		this.comp = comp;
	}
	
	//Features and Methods:
	
	public String getCustomerInfo() {
		return name + " " +age + " " + comp;
	}
	
	
	

}
