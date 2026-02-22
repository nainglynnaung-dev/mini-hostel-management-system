package com.ly.hostel.config;

import java.util.Calendar;
import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.ly.hostel.data.TokenType;

import io.jsonwebtoken.Jwts;

@Service
public class JwtTokenProvider {
	
	
	private static final String Type = null;

	@Value("${app.data.access-life}")
	private int access_life;
	
	@Value("${app.data.refresh-life}")
	private int refresh_life;
	
	private final SecretKey secret=Jwts.SIG.HS512.key().build();
	
	
	public String generateToken(TokenType type,Authentication auth) {
		
		var issuedAt=new Date();
		var expiration=Calendar.getInstance();
		expiration.add(Calendar.MINUTE, type==TokenType.ACCESS?access_life :refresh_life);
		
		return Jwts.builder()
				.setSubject(auth.getName())
				.setIssuedAt(issuedAt)
				.setExpiration(expiration.getTime())
				.claim(Type, type.name())
				.signWith(secret)
				.compact();
			
		
	}
	
	public Authentication parseToken(TokenType type,String token) {
		
		
	}
	
	
	

}
