package com.infosys.project.user.validator;

public class CustomerValidator {
	public static boolean number(String number) throws Exception {
		//String a=Long.toString(number);
		if(number.matches("^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$")){
			return true;
		}else {
			throw new Exception("Invalid phoneNumber!");
		}
	}
	
		
		
	
	public static boolean emailid(String mail) throws Exception {
		if(mail.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
				"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
			return true;
		}else {
			throw new Exception("Invalid email!");
		}}
}
