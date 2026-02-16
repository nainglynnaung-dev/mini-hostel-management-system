package com.ly.hostel.dto.response;

import lombok.Builder;

import java.util.Map;

@Builder
public record ApiResponse(
        Integer status,
        String message,
        Map<String,Object> data,
        Integer pageSize
) {

}
