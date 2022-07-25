package javaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		//ArrayList is a default class 
		//We need to create the object of array list using new keyword
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(200);
		
		System.out.println(ar.size());
		
		ar.add(300);
		ar.add(400);
		
		System.out.println(ar.size());
		
		ar.add(500);
		ar.add(600);
		ar.add(700);
		System.out.println(ar.size());
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(6)); // 700
		//System.out.println(ar.get(7)); // indexOutofBoundException
		//System.out.println(ar.get(-1)); // indexOutofBoundException
		
		ar.remove(5);
		
		System.out.println(ar.get(5));// 700
		System.out.println(ar.size());//6
		
		ar.add(12.33);
		ar.add("testing");
		ar.add('n');
		ar.add(true);
		ar.add(500);
		
		//To print all the values from Array list: using for loop:
		
		for(int i=0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
		
		
		
		
		
		

	}

}
