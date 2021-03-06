package com.heart.echo.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {
	
	public static String generateBCrypt(String password) {
		
		if (password == null) {
			return password;
		}
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		return encoder.encode(password);
		
	}
	
	private static boolean validatePassword(String password, String encoded) {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		return encoder.matches(password, encoded);
	}

}
