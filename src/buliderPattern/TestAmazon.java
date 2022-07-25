package buliderPattern;

public class TestAmazon {

	public static void main(String[] args) {
		
		EcommApp user = new EcommApp();
		// normal way of calling the methods
//		user.login();
//		user.search("Macbook");
//		user.addToCart("Macbook");
		
		// METHOD CHAINNING BUILDER PATTERN:
		//--> methods in ecommApp should return EcommApp object by using this keyword 
		// one drawback is that we cannot do validation in the below pattern
		
		//use case 1
		user.login("kaur@gmail.com", "kaur@123")
		             .search("Nike Tshirt")
		               .addToCart("Nike Tshirt")
		                 .doPayment("6357 3490 3944 343252", 989)
		                   .generateOrderId()
		                      .logout();
		
		//use case 2:
		user.login("kaur@gmail.com", "kaur@123")
				.addToCart("MacBook pro")
					.doPayment("test@okicci")
						.generateOrderId()
							.logout();
		
		//Use case 3:
		user.login()
			.addToCart("Puma shoes")
				.logout();
		
		//Use case 4:
		user.login("test@gmail.com", "test@123")
			.search("GYM Equp", 4)
				.logout();
		
		//Use case 5:
		user.login("Dhara@gmail.com", "dhara345")
			.logout();
		
		

	}

}
