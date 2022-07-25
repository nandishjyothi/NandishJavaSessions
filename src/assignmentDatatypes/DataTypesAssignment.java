package assignmentDatatypes;

public class DataTypesAssignment {

	public static void main(String[] args) {
		
		/*
		 * 1. Write a Java program to print 'Hello' on screen and then print your name
		 * on a separate line. Expected Output : 
		 * Hello 
		 * Naveen K
		 */
		
		System.out.println("Hello");
		System.out.println("Nandish");
		
		

		/*
		 * 2. Write a Java program to print the sum of two numbers. 
		 * Test Data: 74 + 36
		 * Expected Output :110
		 */
		System.out.println("Addition");
		int a = 74;
		int b = 36;
		int sum = a+b;
		
		System.out.println(sum);
		
		
		/*
		 * 3. Write a Java program to divide two numbers and print on the screen. 
		 * Test Data : 50/3 
		 * Expected Output :16
		 */
		System.out.println("division");
		int c = 15;
		int d = 8;
		int ans = c/d;
		
		System.out.println(ans);
		
		System.out.println(5+15/3*2-8%3);
		System.out.println(20+-3*5/8);
		
		

		/*
		 * 5. Write a Java program to compute the specified expressions and print the
		 * output. Go to the editor Test Data:((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
		 * Expected Output 2.138888888888889
		 */
		
		double output = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		
		System.out.println(output);
		
		
		/*
		 * 6. Try concatenation \"Hello Selenium\" with a character 't'.\n\n
		 */		

		String aa = "Hello Selenium";
		System.out.println(aa+" t");
		
		
		/*
		 * 7. Create three int variables having values like : 100, 200, 3400. Add them
		 * and concatenate and generate this output String :
		 * \n\"Your Total amount is. 3700\".\n\n
		 */		
		
		int x = 100;
		int y = 200;
		int z = 3400;
		
		int total =x+y+z;
		
		System.out.println("Your Total amount is : "+total);
		
		
		
		

		/*
		 * 8. What should be the output for : byte b3 = 065; System.out.println(b3);
		 */
		
		byte b3 = 065;
		System.out.println(b3);// prints 53 because from 0-7 it is considered as octal number
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
