package com.ly.hostel.service.impl;

<<<<<<< HEAD
import com.ly.hostel.service.AuthUserService;

public class AuthUserServiceImpl implements AuthUserService {
=======
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
>>>>>>> 4b02302a088beb3c1d5ae4eece0434ffd2d0c9a3
}
