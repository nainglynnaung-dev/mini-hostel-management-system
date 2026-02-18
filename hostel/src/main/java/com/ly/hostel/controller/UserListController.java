package com.ly.hostel.controller;

import com.ly.hostel.service.UserListService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${app.path.v1}")
@RequiredArgsConstructor
public class UserListController {

    private final UserListService userListService;

    @GetMapping("/list")
    public ResponseEntity<?> userLists(@RequestParam("roleName")String roleName,@RequestParam(value = "page",defaultValue = "0")int page,@RequestParam(value = "pageSize",defaultValue = "10")int pageSize){

        return ResponseEntity.ok().body(userListService.getUserListByFilter(roleName.toUpperCase(),page,pageSize));
    }




}
