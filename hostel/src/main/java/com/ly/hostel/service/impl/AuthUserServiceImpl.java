package com.ly.hostel.service.impl;

import com.ly.hostel.dto.auth.RegisterRequest;
import com.ly.hostel.dto.auth.SignInRequest;
import com.ly.hostel.service.AuthUserService;
import org.springframework.stereotype.Service;

@Service
public class AuthUserServiceImpl implements AuthUserService {
    @Override
    public String register(RegisterRequest registerRequest) {
        return "";
    }

    @Override
    public String login(SignInRequest signInRequest) {
        return "";
    }
}
