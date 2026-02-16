package com.ly.hostel.dto.auth;

import lombok.Builder;

@Builder
public record SignInRequest(
        String username, String password
) {
}
