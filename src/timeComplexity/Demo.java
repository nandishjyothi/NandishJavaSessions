package timeComplexity;

public class Demo {

	public static void main(String[] args) {
		
		int i = 10;
		System.out.println(i);
		//time complexity is always denoted by BIG O
		//O(1) -- constant time
		
		int j = 15;
		int sum = i+j;//O(1) it will execute only once
		System.out.println(sum);
		
		//1 to 10:
		for(int k=1;k<=10;k++) {
			System.out.println(k);
		}
		// Time complexity of for loop: 1+n+n+n= 1+3n
		// k=1 takes negligible time so we can ignore 1 therefore 3n 
		// => O(3n) removing the constant => O(n)
		//3n+1 represents linear equation 
		// check out the graph 
		
		//for loop inside a for loop:
		for(int p=1; p<=10; p++) {
			for(int q=1; q<=10; q++) {
				System.out.print(p+""+q+"");
			}
			System.out.println();
		}
		// Time complexity for the above loop:
		// (1+n+n+n)(1+n+n+n)
		// (1+3n)(1+3n)
		// 1+3n+3n+9n^2
		// 9n^2+6n+1 (Quadratic equation)
		// removing constant in the equation
		// 9n^2 + 6 
		// 3(3n^2+2n)
		// 3n(3n+2)
		// remove constant
		// 3n(3n)
		// 9n^2
		// remove constant
		// n^2
		// O(n^2)
		
		//3 for loops
		for(int p=1; p<=10; p++) {
			for(int q=1; q<=10; q++) {
				for(int r=1; r<=10; r++) {
					System.out.print(p+""+q+""+r+" ");
					
				}
				
			}
			System.out.println();
		}
		// Time Complexity:
		// (1+n+n+n)(1+n+n+n)(1+n+n+n) => O(n^3)
		

	}

}
