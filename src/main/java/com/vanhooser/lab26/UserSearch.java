package com.vanhooser.lab26;

import java.util.ArrayList;
import org.apache.commons.codec.digest.DigestUtils;

public class UserSearch {

	public static boolean checkUserAndPass(ArrayList<User> users, String username, String password){
		
		for(User u: users){
			if(u.getUsername().equalsIgnoreCase(username)){
				if(u.getPassword().equals(DigestUtils.md5Hex(password))){
					return true;
				}
			}
		}
		
		return false;
	}
	
	
}
//DigestUtils.md5Hex(