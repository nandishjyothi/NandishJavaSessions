package assignmentConditionalOperators;

public class ConditionalOperators {

	public static void main(String[] args) {
		
		/*
		 * 1. Take three numbers from the user and print the greatest number. 
		 * Test Data
		 * Input the 1st number: 25 
		 * Input the 2nd number: 78 
		 * Input the 3rd number: 87
		 * Expected Output : The greatest: 87
		 */
		
		int a = 25;
		int b = 178;
		int c = 870;
		
		if (a>b && a>c)
		{ 
			System.out.println("The gratest number: "+a);
			
		}
		
		else if(b>a && b>c)
		{
			System.out.println("The greatest number: "+b);
			
		}
		
		else if(c>a && c>b)
		{
			System.out.println("The greatest number: "+c);
			
		}
		
		/*
		 * 2. Write a Java program to test a number is positive or negative. Test Data
		 * Input number: 35 -- positive number 
		 * Input number: -11 -- negative
		 * number\n\n*\n\n
		 */
		
		int number = -35;
		
		if(number <0)
		{
			System.out.println("Negative number: "+number);
		}
		else
		{
			System.out.println("Positive number: "+number);
		}
		

	}

}
