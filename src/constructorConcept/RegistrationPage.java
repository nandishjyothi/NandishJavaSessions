package constructorConcept;

public class RegistrationPage {
	
	
	/* 
	 * Assignment:
	 * registration page:
	 * private class variables: fn, ln,...
	 * constructor will all fields
	 * getter and setter
	 * 
	 * TestRegistration:
	 * create the object for registration page class
	 * try to get some values using getter
	 * try to update email, ph fields.. 
	 * try getting the values using getters
	 * */
	
	
	
	private String firstName;
	private String lastName;
	private String eMail;
	private int telephone;
	private String password;
	private String confirmPassword;
	
	
	public RegistrationPage(String firstName, String lastName, String eMail, int telephone, String password,
			String confirmPassword) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.telephone = telephone;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String geteMail() {
		return eMail;
	}


	public void seteMail(String eMail) {
		this.eMail = eMail;
	}


	public int getTelephone() {
		return telephone;
	}


	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getConfirmPassword() {
		return confirmPassword;
	}


	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	
	
	

}
