package mapConcept;

import java.util.HashMap;

public class LoginPage {
	
	// RBAC - Role based access control 
	// roles/users
	// to maintain the user credentials we can maintain hashMap
	
	public static String getUserCredentials(String role) {
		HashMap<String, String> credMap = new HashMap<String, String>();
		credMap.put("admin", "admin@az.com;admin123");
		credMap.put("customer", "cust@gmail.com;cust123");
		credMap.put("seller", "seller@az.com;seller123");
		credMap.put("partner", "partner@az.com;partner123");
		credMap.put("distributor", "distributor@az.com;distributor123");
		credMap.put("catManager", "cat@az.com;cat123");
		
		return credMap.get(role);
	}
	
	public static void doLogin(String un, String pwd) {
		System.out.println("login with : "+un+":"+pwd);
	}
	
	

	public static void main(String[] args) {
		
		String cred[] = getUserCredentials("catManager").split(";");
		String un = cred[0].trim();
		String pwd = cred[1].trim();
		doLogin(un, pwd);
		
		

	}

}
