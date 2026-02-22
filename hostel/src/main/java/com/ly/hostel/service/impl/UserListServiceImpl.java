package com.ly.hostel.service.impl;

import com.ly.hostel.dto.response.ApiResponse;
import com.ly.hostel.model.AuthUser;
import com.ly.hostel.repository.AuthUserRepository;
import com.ly.hostel.service.UserListService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class UserListServiceImpl implements UserListService {

    private final AuthUserRepository authUserRepository;
    @Override
    public ApiResponse getUserListByFilter(String roleName,int page,int pageSize) {

        Pageable pageable=PageRequest.of(page,pageSize);
        Page<AuthUser> users=authUserRepository.findAllByRole(roleName,pageable);


        return new ApiResponse(200,"Users List successfully retrived", (Map<String, Object>) users,10);
    }
}
