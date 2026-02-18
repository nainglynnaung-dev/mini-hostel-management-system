package com.ly.hostel.service.impl;
import com.ly.hostel.data.RoleStatus;
import com.ly.hostel.dto.auth.RegisterRequest;
import com.ly.hostel.dto.auth.SignInRequest;
import com.ly.hostel.model.AuthUser;
import com.ly.hostel.repository.AuthUserRepository;
import com.ly.hostel.service.AuthUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;



@Service
@RequiredArgsConstructor
public class AuthUserServiceImpl implements AuthUserService {

    private final AuthUserRepository authUserRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    @Override
    public String register(RegisterRequest registerRequest) {
        AuthUser authUser = new AuthUser();
        authUser.setEmail(registerRequest.email());
        authUser.setPassword(passwordEncoder.encode(registerRequest.password()));
        authUser.setUsername(registerRequest.username());
        authUser.setRole(RoleStatus.USER);
        authUserRepository.save(authUser);
        return "";
    }

    @Override
    public Authentication login(SignInRequest signInRequest) {
        var auth=new UsernamePasswordAuthenticationToken(signInRequest.username(), signInRequest.password());
        Authentication authentication=authenticationManager.authenticate(auth);
        SecurityContextHolder.getContext().setAuthentication(authentication);

        return authentication;
    }
}
