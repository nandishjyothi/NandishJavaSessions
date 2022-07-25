package javaSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		//Method to store many values at once:
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		
		System.out.println(numbers);//[10,20,30,40]
		
		//Array literal in static array:
		int i[] = {10,20,30,40,50};
		System.out.println(i);// some random address is printed
		System.out.println(Arrays.toString(i));// prints the values
		
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("JAVA","PYTHON","JS"));
		System.out.println(names);//prints the names
		
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("B","A","C","E","D"));
		
		//To sort the above array list we can use the below method:
		
		System.out.println(l3);
		Collections.sort(l3);
		System.out.println(l3);
		
		//to check whether 2 array list are equal:
		
		System.out.println(l1.equals(l2));// false
		System.out.println(l2.equals(l3));// true
		
		if(l2.equals(l3))
		{
			System.out.println("PASS");
		}
		
		//RemoveALL method
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		
//		l4.removeAll(l5);// removes all the values from l4 which is present in l5 
//		System.out.println(l4);// [F]
//		System.out.println(l5);// [A, B, C, D,E]
		
		l5.removeAll(l4);
		System.out.println(l4);//[A,B,C,D,F]
		System.out.println(l5);//[E]
		
		//find out the common elements:
		//Retain ALL method
		ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		
		lang1.retainAll(lang2);
		System.out.println(lang1);//[A,B,C,D]
		System.out.println(lang2);//[A,B,C,D,E]
		
		//Add ALL method:
		
		ArrayList<String> l6 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l7 = new ArrayList<String>(Arrays.asList("p","q","r"));
		
		l6.addAll(l7);// all the values from l7 is added to l6 
		System.out.println(l6);// [A,B,C,D,F,p,q,r]
		System.out.println(l7);// [p,q,r]
		
		//clear method: to clear all the values from the array list 
		
//		l7.clear();
//		System.out.println(l7);// [ ]
		
		//clone method:
		
		ArrayList<String> cloneList = (ArrayList<String>)l7.clone();// clone method gives object type so typecast to arraylist
		System.out.println(cloneList);
		
		//add at a particular index
		ArrayList<String> l8 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		l8.add(0,"T");
		System.out.println(l8);//[T, A, B, C, D, F]
		
		//l8.add(10,"N");// indexoutofboundexception
		
		l8.add(6, "G");// we can add the value next to last index(5) i.e 6th index in the above example
		System.out.println(l8);
		
		//l8.add(8, "j");indexoutofboundexception bcoz we have to add at 7th position but adding at 8th so the exception
		
		
		
		

	}

}
