package com.ly.hostel.dto.auth;

import lombok.Builder;

@Builder
public record RegisterRequest(
        String username,
        String password,
        String email
) {
}
