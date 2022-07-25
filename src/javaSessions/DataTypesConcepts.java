package javaSessions;

public class DataTypesConcepts {

	public static void main(String[] args) {
		
		//Data Types:
		//Java is strict type
		
		/*
		 * Two Types of data types:
		 *    1. Primitive data types: Don't need object creation
		 *        1. Boolean Type: boolean (true\false)
		 *        2.Numeric type:
		 *           a. Character type: char
		 *           b. Integral type:
		 *                 i. Integer: byte, short, int, long
		 *                 ii. Floating-Point: float, double
		 *     
		 *     2. Non primitive data types: Object creation is required 
		 *         String, Array, Interface, Classes
		 *         
		 */
		
		//1. byte:
		//Size: 1 byte = 8 bits
		//range: -128 to 127
		
		byte b = 10;
		b = 20;
		b = 30;
		
		byte b1 = 40;
		byte b2 = 0;
		byte b3 = 120;
		byte b4 = -50;
		
		System.out.println("Bytes: ");
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b+b1);
		System.out.println("--------------------------------------");
		
		//2.Short:
		//Size: 2 bytes = 16 bits
		//Range: -32768 to 32767
		
		short s1 = 1234;
		System.out.println("short: 2 bytes or 16 bits to store range is -32768 to 32767");
		System.out.println(s1);
		System.out.println("----------------------------------------------");
		
		//3. Int:
		//Size: 4 bytes = 32 bits
		//range: -2147483648 to 214748647
		int i = 23450;
		int i1 = -190;
		int k = 1;// don use int for small number can use byte
		
		//4.long:
		//size: 8 bytes = 64 bits
		//range: -9223372036854775808 to 9223372036854775807
		
		long pop = 1000002022;
		long g = 989887654390L;
		System.out.println("long number");
		System.out.println(g);
		System.out.println("-----------------------------");
		
		//5.float
		//size: 4 bytes = 32 bits
		//range: after.(point) upto 7 decimal digits
		float f1 = 12.33f;
		float f2 = (float)34.55;
		float f3 = 100;// output 100.0
		System.out.println("Floating number");
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f1+f2);
		System.out.println("-------------------------------------");
		
		//6. double:
		//size: 8 bytes = 64 bits
		//range: after . (point) upto 16 decimal digits
		
		double d =12.33;
		double d1 = 34.5555;
		double d3 = 1.1;// no need to use double for small number instead use float
		
		//7. char:
		//Always should be single digit value
		//range: 0-9
		//size: 2 bytes = 16 bits
		
		char c1 = 'e';
		char c2 = '1';
		char c3 = '$';
		System.out.println("char");
		System.out.println(c1);
		System.out.println("-----------------------------------");
		
		//8. boolean: true or false
		//size = around 1 bit
		boolean flag = true;
		System.out.println("boolean");
		System.out.println(flag);
		System.out.println("-------------------------------------");
		
		
		/*
		 * //Assignment: What should be the output for : 
		 * byte b3 = 065;
		 * System.out.println(b3);
		 */
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
