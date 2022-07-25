package javaSessions;

public class StringConcatenation {

	public static void main(String[] args) {
		
		String s = "hello world";
		String s1 = "100";
		String ph ="985730932";
		String cc = "1234 5899 3094 3439";
		
		String x = "Hello";
		String y = "Testing";
		
		int a = 100;
		int b = 200;
		
		System.out.println(a+b);// 300 (normal addition)
		System.out.println(x+y);// HelloTesting (concat operator)
		
		System.out.println(x+a);// Hello100
		System.out.println(a+x);// 100Hello
		//always operation starts from left to right
		System.out.println(a+b+x+y);// 300HelloTesting
		System.out.println(x+y+a+b);// HelloTesting100200
		System.out.println(x+y+(a+b)); //HelloTesting300
		
		System.out.println(x+y+a+b+a+b);//HelloTesting100200100200
		
		System.out.println("the value of a : "+a);//the value of a : 100
		System.out.println("the value of b : "+b);// the value of b : 200
		System.out.println("the sum : "+ a+b); // the sum :100200
		System.out.println("the sume : "+(a+b));//the sum : 300
		
		System.out.println(x+" "+y);// Hello Testing 
		
		double c = 12.33;
		double d = 23.44;
		System.out.println(x+y+c+d);// HelloTesting12.3323.44
		
		char c1 = 'a';// a ascii value 97
		char c2 = 'b';// b ascii value 98
		System.out.println(c1+c2);// 195
		//range of ascii value:
		// a-z = 97 to 122
		// A-Z = 65 to 90
		// 0-9 = 48 to 57
		
		System.out.println(c1+""+c2);// ab
		
		byte b1 = 120;
		byte b2 = 50;
		//byte b3 = b1+b2;//error as the range is going beyond byte range
		
		byte b4 = 60;
		byte b5 = 50;
		//byte b6 = b4+b5;// error any arithmetic operation with byte and short results in integer therefore store in the below format
		int b6 = b4+b5;
		System.out.println(b4+b5); //110// is possible
		System.out.println(b6);//110
		
		
		int g = 10;
		int h = 2;
		
		System.out.println(g/h);//5
		
		int g1 = 10;
		int h1 = 3;
		
		System.out.println(g1/h1);//3
		
		System.out.println(10/2);//5
		System.out.println(10.0/2);//5.0
		System.out.println(10.0/2.0);//5.0
		System.out.println(10/2.0);//5.0
		System.out.println(10/3.0);//3.33333..5
		
		//System.out.println(9/0);// arithmetic exception /by zero
		System.out.println(0/9);//0
		//System.out.println(0/0);// arithmetic exception /by zero 
		//any number divided by 0 gives arithmetic exception
		System.out.println(0.0/0);// NAN (Not A Number)
		System.out.println(0/0.0);// NAN (Not A Number)
		System.out.println(0.0/0.0);// NAN
		System.out.println(5/0.0);// Infinity
		System.out.println(5.0/0.0);// Infinity
		
		
		char t = 'a';
		System.out.println(t);//a
		System.out.println((int)t);//97
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
