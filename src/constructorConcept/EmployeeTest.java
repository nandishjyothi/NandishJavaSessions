package constructorConcept;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.name = "Poornima";
		e1.age = 25;
		e1.id = 100;
		e1.isPerm = true;
		e1.gender = 'f';
		
		// draw back of the above approach is that every time we need to create object and assign the value
		
		Employee e2 = new Employee(10);
		
		Employee e3 = new Employee("Tom", 201);
		System.out.println(e3.name+" "+e3.id+" "+e3.age+" "+e3.isPerm+" "+e3.gender);
		// the advantage here is, based on certain values we can allow to create the object
		
		Employee e4 = new Employee("Peter", 202, 30, 13.44, true, 'm');
		System.out.println(e4.name+" "+e4.id+" "+e4.age+" "+e4.isPerm+" "+e4.gender+" "+e4.salary);
		System.out.println(e4.name + e4.age);
		
		
		//Users class:
		Users u1 = new Users("Nandish", "Bangalore");
		Users u2 = new Users("Tom", 100, "NY");  
		Users u3 = new Users("Rahul", 102, true, "pune");
		
		//MySystem class:
		
		//MySystem sys = new MySystem(); // not able to create because constructor is private 
		
		
		

	}

}
