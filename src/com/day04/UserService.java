package com.day04;

public class UserService {

	public boolean login(String username,String password) {
		if(username.equals("jack") && password.equals("123")) {
			return true;
		}
		return false;
	}
	
}
