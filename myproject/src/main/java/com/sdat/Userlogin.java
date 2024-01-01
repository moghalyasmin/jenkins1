package com.sdat;

import java.util.ResourceBundle;

public class Userlogin {
	int i=0;
	
	public int userlogin(String Uname, String Upass) {
		
	ResourceBundle rb=ResourceBundle.getBundle("config");
	String username=rb.getString("username");
	String password= rb.getString("password");
	
	
	if(Uname.equals(username) && Upass.equals(password))
		return 1;
	else
		return 0;
		
		
	
	

}
}
