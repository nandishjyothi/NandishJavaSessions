package javaSessions;

public class IncrementAndDecrement {

	public static void main(String[] args) {
	
		//1. Post Increment:
		
		int a = 1;
		int b = a++; // first a value is assigned to b and the a is incremented 
		System.out.println(a); // 2
		System.out.println(b); // 1
		
		int g  = -99;
		int h = g++;
		System.out.println(g);// -99 + 1 = -98
		System.out.println(h);// -99
		
		
		//2. Pre Increment:
		
		int c = 1;
		int d = ++c;
		System.err.println(c);// 2
		System.out.println(d);// 2
		
		int m = -97;
		int n = ++m;
		System.err.println(m);// -96
		System.out.println(n);// -96
		
		//3. Post Decrement:
		
		int p = 2;
		int q = p--;
		System.out.println(p);// 1
		System.out.println(q);// 2
		
		//4. Pre Decrement:
		int u = 2;
		int y = --u;
		System.out.println(u);// 1
		System.out.println(y);// 1
		
		
		int t1 = 2;
		System.out.println(t1++);// 2
		System.out.println(t1);// 3
		
		int l = 5;
		System.out.println(++l);// 6
		System.out.println(l);// 6
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
