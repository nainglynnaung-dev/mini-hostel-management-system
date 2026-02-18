package com.ly.hostel.config;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.crypto.SecretKey;

import io.jsonwebtoken.JwtException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import com.ly.hostel.data.TokenType;

import io.jsonwebtoken.Jwts;

@Service
public class JwtTokenProvider {
	
	
	private static final String Type = "typ";
	private static final String Role = "rol";

	@Value("${app.data.access-life}")
	private int access_life;
	
	@Value("${app.data.refresh-life}")
	private int refresh_life;
	
	private final SecretKey secret=Jwts.SIG.HS512.key().build();

	public String generateAccessToken(Authentication auth) {
		return generateToken(TokenType.ACCESS, auth);
	}

	public String generateRefreshToken(Authentication auth) {
		return generateToken(TokenType.REFRESH, auth);
	}

	public Authentication parseAccessToken(String token){
		return parseToken(TokenType.ACCESS, token);
	}

	public Authentication parseRefreshToken(String token){
		return parseToken(TokenType.REFRESH, token);
	}
	
	
	private String generateToken(TokenType type,Authentication auth) {
		
		var issuedAt=new Date();
		var expiration=Calendar.getInstance();
		expiration.add(Calendar.MINUTE, type==TokenType.ACCESS?access_life :refresh_life);
		
		return Jwts.builder().subject(auth.getName()).issuedAt(issuedAt).expiration(expiration.getTime())
				.claim(Type, type.name())
				.signWith(secret)
				.compact();
			
		
	}
	
	private Authentication parseToken(TokenType type,String token) {

		var jwt=Jwts.parser().verifyWith(secret).build().parseClaimsJws(token);

		var username=jwt.getPayload().getSubject();
		var tokenType=jwt.getPayload().get(Type,String.class);
		if (!type.name().equals(tokenType)) {
			throw new JwtException("Invalid token");
		}
		var roles=jwt.getPayload().get(Role,String.class);

		return new UsernamePasswordAuthenticationToken(username,"",
				Arrays.stream(roles.split(",")).map(SimpleGrantedAuthority::new).toList()
				);
	}
	
	
	

}
