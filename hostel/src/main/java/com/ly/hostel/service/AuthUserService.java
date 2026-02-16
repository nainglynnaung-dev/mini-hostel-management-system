package com.ly.hostel.service;

<<<<<<< HEAD
public interface AuthUserService {
=======
import com.ly.hostel.dto.auth.RegisterRequest;
import com.ly.hostel.dto.auth.SignInRequest;

public interface AuthUserService {

    public String register(RegisterRequest registerRequest);

    public String login(SignInRequest signInRequest);
>>>>>>> 4b02302a088beb3c1d5ae4eece0434ffd2d0c9a3
}
