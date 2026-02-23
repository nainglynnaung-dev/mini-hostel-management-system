package com.ly.hostel.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "hostelOwner")
@Data
@RequiredArgsConstructor
public class HostelOwner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long phoneNumber;
    
    @OneToOne
    @JoinColumn(name = "auth_user_id", referencedColumnName = "id")
    private AuthUser authUser;
    
    @OneToMany(mappedBy = "hostelOwner",cascade = CascadeType.ALL)
    private List<Hostel> hostel;

}
