package com.ly.hostel.model;

import com.ly.hostel.data.RoleStatus;
import com.ly.hostel.data.Status;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "hostelUser")
public class HostelUser {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;    
    
    private String name;    
    private String phone;
    
    @OneToOne
    @JoinColumn(name = "hostel_user_id", referencedColumnName = "id")
    private AuthUser authUser;     

}
