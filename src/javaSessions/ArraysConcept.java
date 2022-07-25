package javaSessions;

public class ArraysConcept {

	public static void main(String[] args) {
		
		//1. Int type of array
		
		int i[] = new int[4];
		
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		//System.out.println(i[4]);// ArrayIndexOutOfBoundsException:
		//System.out.println(i[-1]);//ArrayIndexOutOfBoundsException:
		//System.out.println(i);// prints some random number (address)
		
		System.out.println(i[0]+ i[2]); // 10+30 = 40
		
		int len = i.length;
		System.out.println("Length = "+len);
		System.out.println("Hi = "+(len-1));
		System.out.println("Li = "+0);
		
		
		//print all the values from array: for loop:
		
		for(int k=0; k<len; k++)
		{
			System.out.println(i[k]);
		}
		
		for(int k=0; k<=len-1; k++)
		{
			System.out.println(i[k]);
		}
		
		for(int k=0; k<i.length; k++)
		{
			System.out.println(i[k]);
		}
		
		// For each loop / enhanced for loop
		System.out.println("For each loop/enhanced for loop");
		for(int e: i)
		{
			System.out.println(e);
		}
		
		// 2. double array
		
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 100;
		d[2] = 34.44;
//		d[3] = 21.33; //Array index out of bound exeption
//		System.out.println(d[3]);
		
		for(double e: d)
		{
			System.out.println(e);
		}
		
//		3. char array:
		
		char c[] = new char[3];
		c[0] = 'a';
		c[1] = '$';
		c[2] = '1';
		
		for(char e: c)
		{
			System.out.println(e);
		}
		
//		4.String Array:
		
		String lang[] = new String[4];
		lang[0] = "JAVA";
		lang[1] = "PYTHON";
		lang[2] = "JS";
		lang[3] = "RUBY";
		
		System.out.println(lang[0] + lang[1]);
		
		for(int p = 0; p<lang.length; p++)
		{
			System.out.println(lang[p]);
		}
		
		//for each loop
		for(String e: lang)
		{
			System.out.println(e);
		}
		
		//ASSIGNMENT: Print index and value for the above string array using for each loop
		int index = 0;
		
		for(String e: lang)
		{
			System.out.println(index +" : "+e);
			index++;
		}
		/*
		 * // Limitation of Array: 
		 * 1. size of the array is fixed: can be overcome by
		 * using dynamic array ex: array list 
		 * 2.Similar type of data can only be stored
		 * in the array: can be overcome by using dynamic array ex: array list/Static
		 * Object Array
		 */
		
		//Static object array: 
		// we will not use this generally
		
		Object emp[] = new Object[4];
		emp[0] = "Tom";
		emp[1] = 25;
		emp[2] = 'm';
		emp[3] = 23.44;
		
		for(Object e: emp)
		{
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
