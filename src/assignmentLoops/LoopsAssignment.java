package assignmentLoops;

public class LoopsAssignment {

	public static void main(String[] args) {
		
		/*
		 * 1. Print following output: 
		 * I am Batman 
		 * I am Batman 
		 * I am Batman 
		 * I am Batman 
		 * I am Batman
		 */
		
		for(int i=1; i<=5;i++)
		{
			System.out.println("I am Batman");
		}
		
		/*
		 * 2. WAP to print following output: 
		 * I am Batman 1 
		 * I am Batman 2 
		 * I am Batman 3 
		 * I am Batman 4 
		 * I am Batman 5 
		 * I am Batman 6 
		 * I am Batman 7 
		 * I am Batman 8
		 * I am Batman 9
		 */
		System.out.println();
		for(int i=1; i<10;i++)
		{
			System.out.println("I am Batman "+i);
		}
		
		/* 3. WAP to print 10 to 1 using for, while and do-while loop */
		
		//for loop:
			System.out.println();
			System.out.println("For loop");
			for(int i=10; i>=1;i--)
			{
				System.out.println(i);
			}
		
		//while loop:
				System.out.println();
				System.out.println("while loop");
				int a=10;
				while(a>=1)
				{
					System.out.println(a);
					a--;
				}
		//do while loop:
				System.out.println();
				System.out.println("do while loop");
				int b=10;
				do
				{
					System.out.println(b);
					b--;
				}while(b>=1);
		
				
				/*
				 * 4. Write a program in Java to print \"Hello World\" ten times using while
				 * loop
				 */				
				
				System.out.println();
				int c = 1;
				while(c<=10)
				{
					System.out.println("Hello World");
					c++;
				}
				
	//5. Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered	
				System.out.println();
				int d= 1;
				while(d<=10)
				{
					if(d%7==0)
					{
						break;
					}
					else
					{
						System.out.println(d);
						d++;
					}
				}
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
