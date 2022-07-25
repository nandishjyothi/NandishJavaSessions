package javaSessions;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
		
		//Int Array list
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(100);
		//ar.add(12.33);// not allowed
		ar.add(200);
		ar.add(300);
		ar.add(400);
		
		//for each
		for(Integer e: ar)
		{
			System.out.println(e);
		}
		
		//we can also use the below for loop
		for(int e: ar)
		{
			System.out.println(e);
		}
		
		//double Array list:
		ArrayList<Double> ar1 = new ArrayList<Double>();
		
		ar1.add(12.33);
		
		//ar1.add(100);//not allowed
		ar1.add(100.00);
		
		for(double e : ar1) {
			System.out.println(e);
		}
		
		System.out.println("Double:");
		for (int i=0; i<ar1.size(); i++)
		{
			System.out.println(ar1.get(i));
		}
		
		//String Array list:
		ArrayList<String> prodList = new ArrayList<String>();
		prodList.add("Apple");
		prodList.add("Samsung");
		prodList.add("Nokia");
		
		for(String e : prodList) {
			System.out.println(e);
		}
		
		//Object Array List when diff type data needs to be stored:
		ArrayList<Object> empData = new ArrayList<Object>();
		empData.add("Dhara");
		empData.add(25);
		empData.add('f');
		empData.add(34.55);
		empData.add(true);
		
		
		for(Object e : empData) {
			System.out.println(e);
		}

	}

}
