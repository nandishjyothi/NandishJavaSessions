package stringConcepts;

public class StringManipulation {
	
	public static void main(String[] args) {
		
		String s = "This is my java code and I am so happy java is best i"; 
		
		System.out.println(s.length());// 53
		System.out.println(s.charAt(0));// T
		System.out.println(s.charAt(37));// y
		//System.out.println(s.charAt(38));// StringIndexOutOfBoundException
		//System.out.println(s.charAt(-1));// StringIndexOutOfBoundException
		
		System.out.println(s.indexOf('j'));// 11
		System.out.println(s.indexOf('i'));// 2 it will givie you first occurrence of i
		System.out.println(s.indexOf('i', 3));// 2nd occurrence of i
		//if the string is changed then it show the wrong index as it is hard coded instead we can write in the below way
		System.out.println(s.indexOf('i', s.indexOf('i')+1)); // 2nd occurrence
		System.out.println("3 rd occurrence");
		System.out.println(s.indexOf('i',(s.indexOf('i',s.indexOf('i')+1))+1));// 44
		System.out.println("4th occurrence");
		int thirdOccurrence = s.indexOf('i',(s.indexOf('i',s.indexOf('i')+1))+1);
		System.out.println(s.indexOf('i', thirdOccurrence+1));// 52
		System.out.println();
		System.out.println(s.indexOf("code"));// 16
		System.out.println(s.indexOf("python"));// -1
		
		String mesg = "Welcome Admin";
		if(mesg.indexOf("Admin")>0) {
			System.out.println("Pass");
		}
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		String str = "    Hello World   ";
		System.out.println(str.trim());// remove from corners
		
		// to remove space between words by using replace method
		System.out.println(str.replace(" ", ""));
		
		String dob = "01-01-1990";// update to 01/01/1990
		System.out.println(dob.replace("-", "/"));
		
		 //Contains:
		String s1 = "your user id is naveenautomation";
		System.out.println(s1.contains("naveenautomation"));
		if(s1.contains("naveenautomation"))
		{
			System.out.println("PASS");
		}
		
		//Comparison:
		System.out.println("COMPARISION");
		System.out.println();
		String t1 = "hello java";// String literals without new keyword 
		String t2 = "hello java";
		System.out.println(t1.equals(t2));
		System.out.println(t1.equalsIgnoreCase(t2));
		System.out.println(t1);
		System.out.println(t2);
		// we are comparing the object reference and not the values
		System.out.println(t1==t2);// true because both t1 and t2 are pointing to same value in SCP
		t2 = "hello python";
		System.out.println(t1==t2);// true not recommended 
		
		// interview question: how many objects will be created in below statement?
		String t3 = new String("hello ruby");// 2 objects created
		//Ans: it creates 2 string objects one in the String pool and one in the heap memory 
		String t4 = "hello ruby"; // 0 object created 
		String t5 = new String("hello ruby");// 1 object created 
		
		System.out.println(t3==t5);// false here we are doing reference address comparison 
		System.out.println(t3==t4);// false 
		
		// good method to create strings is by using string literals never use new keyword to create string 
		
		//SPLIT:
		System.out.println();
		System.out.println("Split method:");
		String lang = "JAVA_PYTHON_RUBY_PHP";
		String langArr[] = lang.split("_");// split returns String array
		System.out.println(langArr[0]);
		for(String e: langArr)
		{
			System.out.println(e);
		}
		
		//interview question:
		System.out.println();
		System.out.println("Split Interview question");
		String name = "xXtestingxXjavaxXXSeleniumXxXPython";
		String nameArr[] = name.split("xX");
		System.out.println(nameArr.length);
		System.out.println(nameArr[0]);// blank value is printed 
		System.out.println(nameArr[1]);// testing
		System.out.println(nameArr[2]);// java
		System.out.println(nameArr[3]);// XseleniumX
		System.out.println(nameArr[4]);// Python
		
		// In selenium we can use split for data driven approach 
		//ex:1
		System.out.println();
		String empData = "Hiren;Patel;40;NY;USA;01-01-1970;selenium;QA";
		String emp[] = empData.split(";");
		for(String e: emp) {
			System.out.println(e);
		}
		
		//ex 2:
		// Not a good practice 
		System.out.println();
		String credentials = "admin;admin123";
		System.out.println(credentials.split(";")[0]);
		System.out.println(credentials.split(";")[1]);
		
		
		//SUBSTRING:
		System.out.println("SUBSTRING CONCEPT: ");
		String message = "your order id is 12345";
		//Hard coded way:
		System.out.println(message.substring(8));// starts printing from 8th index to the end of the string o/p:er id is 12345
		System.out.println(message.substring(17));// starts printing from 17th index to the end of the string o/p:12345
		System.out.println(message.substring(0, 10));// starts printing from 0th index to 9th index o/p:your order
		//General way:
		System.out.println(message.substring(message.indexOf("is")+3, message.length()));//12345
		String orderId = (message.substring(message.indexOf("is")+3, message.length()));
		System.out.println(orderId);// 12345
		
		
		
		
		
		
		
		
		
		
	}
	

}
