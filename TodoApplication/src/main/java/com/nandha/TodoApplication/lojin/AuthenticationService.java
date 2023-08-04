package com.nandha.TodoApplication.lojin;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		
		boolean isValidUserName = username.equalsIgnoreCase("todo");
		boolean isValidPassword = password.equalsIgnoreCase("todo");
		
		return isValidUserName && isValidPassword;
	}
}