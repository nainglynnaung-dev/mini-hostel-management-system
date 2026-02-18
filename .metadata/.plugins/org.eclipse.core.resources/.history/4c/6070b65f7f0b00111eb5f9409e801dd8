package com.ly.hostel.model;

import com.ly.hostel.data.RoleStatus;
import com.ly.hostel.data.Status;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class AuthUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String email;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Enumerated(EnumType.STRING)
    private RoleStatus role;

    public AuthUser() {
    }
    public AuthUser(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
