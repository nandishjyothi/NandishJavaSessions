package constructorConcept;

public class TestRegistration {

	public static void main(String[] args) {
		
		RegistrationPage r1 = new RegistrationPage("Tom", "Peter", "Tom@gmail.com", 34072439, "Tom@2022", "Tom@2022");
		
		
		System.out.println(r1.getFirstName());
		System.out.println(r1.getLastName());
		System.out.println(r1.geteMail());
		System.out.println(r1.getTelephone());
		System.out.println(r1.getPassword());
		System.out.println(r1.getConfirmPassword());
		
		r1.setLastName("alex");
		r1.seteMail("tomalex@gmail.com");
		r1.setTelephone(9849755);
		r1.setPassword("Test@2022");
		
		System.out.println();
		System.out.println("After updating");
		System.out.println(r1.getFirstName());
		System.out.println(r1.getLastName());
		System.out.println(r1.geteMail());
		System.out.println(r1.getTelephone());
		System.out.println(r1.getPassword());
		//System.out.println(r1.getConfirmPassword());
		
		

	}

}
