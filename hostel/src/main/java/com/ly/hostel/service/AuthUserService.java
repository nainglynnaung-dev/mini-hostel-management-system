package com.ly.hostel.service;

import com.ly.hostel.dto.auth.RegisterRequest;
import com.ly.hostel.dto.auth.SignInRequest;

public interface AuthUserService {

    public String register(RegisterRequest registerRequest);

    public String login(SignInRequest signInRequest);
}
