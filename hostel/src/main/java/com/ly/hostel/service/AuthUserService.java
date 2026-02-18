package com.ly.hostel.service;
import com.ly.hostel.dto.auth.RegisterRequest;
import com.ly.hostel.dto.auth.SignInRequest;
import org.springframework.security.core.Authentication;


public interface AuthUserService {

    public String register(RegisterRequest registerRequest);

    public Authentication login(SignInRequest signInRequest);
}
