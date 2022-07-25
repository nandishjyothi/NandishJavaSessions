package assignmentArray;

public class Array {

	public static void main(String[] args) {
		
		/*
		 * Question 1: Write a program to print the following pattern using for loop:
		 * 00 01 02 03 04 05 06 07 08 09 
		 * 10 11 12 13 14 15 16 17 18 19 
		 * 20 21 22 23 24 25 26 27 28 29 
		 * 30 31 32 33 34 35 36 37 38 39
		 */
		
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<10; j++)
			{
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}
		
		/*
		 * Question 2: Write a program to create a static Array, having following
		 * cricket data:
		 *  name(String), 
		 *  age(age), 
		 *  team name(String), 
		 *  DOB(String),
		 * gender(char), 
		 * Strike Rate(Double), 
		 * isActive(boolean) 
		 * Try to create multiple
		 * Object Arrays for different players Try to print all the values of each
		 * player on the console using normal for/while loop and for each loop
		 */
		
		
		Object virat[] = new Object[7];
		Object rahul[] = new Object[7];
		Object chalal[] = new Object[7];
		
		virat[0] = "Virat";
		virat[1] = 32;
		virat[2] = "RCB";
		virat[3] = "30-05-2022";
		virat[4] = 'M';
		virat[5] = 58.67;
		virat[6] = true; 
		
		rahul[0] = "rahul";
		rahul[1] = 30;
		rahul[2] = "RCB";
		rahul[3] = "31-05-2022";
		rahul[4] = 'M';
		rahul[5] = 58.67;
		rahul[6] = true; 
		
		chalal[0] = "chalal";
		chalal[1] = 28;
		chalal[2] = "RCB";
		chalal[3] = "23-05-2022";
		chalal[4] = 'M';
		chalal[5] = 58.67;
		chalal[6] = true; 
		System.out.println();
		for(int i=0; i<virat.length; i++)
		{
			System.out.println(virat[i]);
		}
		System.out.println();
		for(int i=0; i<rahul.length; i++)
		{
			System.out.println(rahul[i]);
		}
		System.out.println();
		for(int i=0; i<chalal.length; i++)
		{
			System.out.println(chalal[i]);
		}
		
		for(Object e: virat)
		{
			System.out.println(e);
		}
		
		for(Object e: rahul)
		{
			System.out.println(e);
		}
		
		for(Object e: chalal)
		{
			System.out.println(e);
		}
		

		/*
		 * Question 3: Try to print the following pattern on the console
		 *  n = 4 
		 *  n = 3 
		 *  n = 2 
		 *  n = 1 
		 *  n = 0
		 */
		
		for(int i=4; i>=0; i--)
		{
			System.out.println("n = "+i);
		}
		
		
		
		
		
		
		
		

	}

}
