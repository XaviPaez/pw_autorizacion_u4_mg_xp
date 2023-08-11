package com.example.demo.security;

import org.springframework.security.core.Authentication;

public class JwtUtils {
	
	public String generateJwtToken(Authentication authentication, String nombre) {
		return nombre;
		
	}
}
