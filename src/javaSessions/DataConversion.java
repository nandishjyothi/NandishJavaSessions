package javaSessions;

public class DataConversion {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20); // 10020
		
		// String to int conversion:
		int i = Integer.parseInt(x); // 100
		System.out.println(i+20);// 120
		
		
		String y = "100A";
		//int j = Integer.parseInt(y);// NumberFormatException
		System.out.println(y);
		String m = y.replace("A", "");
		System.out.println(m);//"100"
		int j = Integer.parseInt(m);//100
		System.out.println(j+10);// 110
		// parseInt is static method
		
		
		//Stirng to double:
		String p = "12.33";
		System.out.println(p+20);// 12.3320
		
		double d = Double.parseDouble(p);//12.33
		System.out.println(d+20);// 32.33
		
		//int to String:
		int total = 100;
		String t = String.valueOf(total);// "100"
		System.out.println(t+20);//"10020"
		
		// Data conversion will happen with the help of wrapper classes (Integer, Double, Short) 
	}

}
