package com.ly.hostel.model;

import com.ly.hostel.data.RoleStatus;
import com.ly.hostel.data.Status;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "authUser")
public class AuthUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String email;

    @Enumerated(EnumType.STRING)
    private RoleStatus role;

    @Enumerated(EnumType.STRING)
    private Status status;
    
    @OneToOne(mappedBy = "authUser", cascade = CascadeType.ALL)
    private HostelUser hostelUser;
    
    @OneToOne(mappedBy = "authUser", cascade = CascadeType.ALL)
    private HostelOwner hostelOwner;

    public AuthUser(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
