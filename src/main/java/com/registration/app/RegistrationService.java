
package com.registration.app;
public class RegistrationService{
	public void registration(Registration obj){
		System.out.println("service : " + obj.name + "  " + obj.email + " " + obj.phone);
		RegistrationDao registrationDao=new RegistrationDao();
		registrationDao.registration(obj);
		System.out.println("its service");
		
	}
}