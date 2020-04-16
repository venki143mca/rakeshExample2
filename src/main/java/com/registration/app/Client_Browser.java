package com.registration.app;

import com.market.app.UserController;

public class Client_Browser {
	public static void  main(String[] args) {
		
		
		UserController userController = new UserController();
		boolean result = userController.login("u", "p");
		
		if(!result) {
			RegistrationController controler = new RegistrationController();
			controler.registration("rakesh", "rrr@gmail.com","88888");
			System.out.println("Succesfull");
			controler.registration("rakesh", "p1","12345");
			System.out.println("000");
		} else {
			System.out.println("Login Success.");
			System.out.println("Registration Failed.");
		}
		
		
		
	}
}