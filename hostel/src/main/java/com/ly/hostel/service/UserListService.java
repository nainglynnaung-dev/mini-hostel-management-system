package com.ly.hostel.service;

import com.ly.hostel.dto.response.ApiResponse;
import com.ly.hostel.model.AuthUser;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserListService {

    ApiResponse getUserListByFilter(String roleName,int page,int pageSize);
}
