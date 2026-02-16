package com.ly.hostel.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "owners")
@Data
@RequiredArgsConstructor
public class Tenant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long phoneNumber;
    @OneToOne(cascade = CascadeType.ALL)
    private AuthUser authUser;


}
