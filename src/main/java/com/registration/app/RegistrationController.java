package com.registration.app;

public class RegistrationController{
	public void registration(String name,String email,String phone) 
	{
		System.out.println("name : mail:no" + name + email + phone);
		Registration registration = new Registration();
		registration.name = name;
		registration.email = email;
		registration.phone = phone;
		
		RegistrationService service = new RegistrationService();
		service.registration(registration);
		System.out.println("its Controller");
	}
}	