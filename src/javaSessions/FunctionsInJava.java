package javaSessions;

public class FunctionsInJava {

	// Main method is also a function
	// Function cannot be created with in function
	// functions are independent to one another
	// we can call the function from other function
	// 3 types of functions:

	// 1.) no input and no return
	// void-> no return

	public void test() {
		
		System.out.println("test Method");
		int i =10;//local variable
		System.out.println(i);

	}
	
	public void getPrint()
	{
		System.out.println("print my paper");
	}
	
	//2.) No input but some return:
	// return type is int
	public int getBalance()
	{
		System.out.println("get Balance");
		int fee = 10;
		int tax = 5;
		int total = fee+tax;
		return total;
		
	}
	
	public String getTrainerName() {
		System.out.println("Get Trainer Name: ");
		String name = "Naveen";
		return name;
	}
	
	public boolean isEmpActive() {
		System.out.println("Is emp active");
		return true;
		
	}
	
	//3. Some input and some return:
	
	public int add(int a, int b) {
		
		System.out.println("Add method");
		int z = a+b;
		return z;
	}
	
	public int getCourseFee(String courseName) {
		
		System.out.println("Get course name "+courseName);
		
		if(courseName.equals("Selenium")) {
			
			return 100;
		}
		else if(courseName.equals("API")) {
			return 50;
		}
		else if(courseName.equals("Mobile")) {
			return 70;
		}
		else
		{
			System.out.println("Course not found");
			return -1;// standard format
		}
		
	}

	public static void main(String[] args) {
		
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		obj.getPrint();
		int p = obj.getBalance();// good way to write code i.e to store return value in a variable
		System.out.println(p);
		
		System.out.println(obj.getBalance());
		
		String s = obj.getTrainerName();
		System.out.println("Trainer name is: "+s);
		
		if(obj.isEmpActive()) {
			System.out.println("Pass");
		}
		
		boolean b = obj.isEmpActive();
		System.out.println(b);
		
		int s1 = obj.add(10, 20);
		System.out.println(s1);
		
		int s2 = obj.add(30, 40);
		System.out.println(s2-10);
		

		int f1 = obj.getCourseFee("Selenium");
		System.out.println("Course fee for selenium: "+f1);
		
		int f2 = obj.getCourseFee("C#");
		System.out.println("Course fee for selenium: "+f2);
		
		if(f2==-1) {
			System.out.println("This is not part of the training......");
		}

	}

}
