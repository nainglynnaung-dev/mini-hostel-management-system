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
@Entity
@Table(name = "users")

@Data
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public RoleStatus getRole() {
		return role;
	}
	public void setRole(RoleStatus role) {
		this.role = role;
	}
    
    
}
