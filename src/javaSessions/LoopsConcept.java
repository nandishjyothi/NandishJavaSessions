package javaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		
		// print from 1 to 10
		//worst way to write is to use syso 10 times
		
		//1. while loop:
		
		int i = 1;
		while(i<=10)
		{
			System.out.println(i);
			//i++;
			//++i;
			i = i+1;
			
		}
		
		int k=1;
		while(true)
		{
			System.out.println(k);
			k++;
			if(k==20)
			{
				break;
			}
		}
		
		//infinite loop:
		//while(true)
		//{
			//System.out.println("Welcome to Hotel Taj ....");
		//}
		
		/* Use cases of loop: 
		 *       we have to use while loop when we are not sure about number of cycles/iterations
		 *       ex: Pagination, carousel, calendar
		 * */
			
		//---------------------------------------------------------------------------------------------------------------
		//---------------------------------------------------------------------------------------------------------------
		
		
		//2. FOR LOOP:
		//this is also called typical for loop (index based for loop)
		// print 1 to 10
		for(int i1 = 1; i1<=10; i1++)
		{
			System.out.println(i1);
		}
		
		// other ways to write for loop
		//first loop
		int p=1;
		for(;p<=10;p++)
		{
			System.out.println(p);
		}
		
		//second one
		
		int k1=1;
		for(;k1<=10;)
		{
			System.out.println(k1);
			//k++;
			//++k;
			k1=k1+1;
		}
		
		//infinite for loop
		/*
		 * for(int g =1; g<=10;)
		 *  { System.out.println(g); }
		 */
		//other way to print infinite loop
		/*
		 * for(;;) { System.out.println("Welcome to bangalore..."); }
		 */
		
		//even numbers upto 10
		
		System.out.println("even numbers");
		for(int even=2;even<=10; even=even+2)
		{
			System.out.println(even);
		}
		
		//odd number:
		System.out.println("print odd number:");
		for(int odd = 1; odd<=10; odd=odd+2)
		{
			System.out.println(odd);
		}
		
		//we can use double also:
		
		for(double d=1.0; d<=10.0; d++)
		{
			System.out.println(d);
		}
		
		//characters in loop
		//Print A-Z
		System.out.println("Characters in for loop");
		for(char c='A';c<='Z';c++)
		{
			System.out.println(c);
		}
		
		//Print a-z
		System.out.println("a-z");
		for(int as = 97; as<=122; as++)
		{
			System.out.println((char)as);
		}
		
		
		//using modulus 
		System.out.println("-----------------------------------------");
		for (int t=1; t<=100;t++)
		{
			System.out.println(t);
			if(t%5==0)
			{
				System.out.println(t+"hi");
			}
		}
		
		
		//ASSIGNMENT 1: print even numbers using % operator 
		System.out.println("Print even number using %");
		for(int v=1;v<=20;v++)
		{
			if(v%2==0)
			{
				System.out.println(v+" is a even number");
			}
			
		}
		
		//ASSIGNMENT 2: print odd numbers using % operator 
		
		System.out.println("Print odd number using %");
		for(int v1=1;v1<=20;v1++)
		{
			if(v1%2!=0)
			{
				System.out.println(v1+" is a odd number");
			}
			
		}
		
		//3. Do while Loop:
		
		int r =1;
		do {
			
			System.out.println(r);
			r++;
			
		} while (r<=10);
		
		//if we use break inside loop
		
		do {
			
			System.out.println(r);
			r++;
			break;//output 1 
			
		} while (r<=10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
