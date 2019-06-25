package com.bhaskar.singh.f2410_backend.entities.security;

import com.bhaskar.singh.f2410_backend.entities.AbstractEntities;
import com.bhaskar.singh.f2410_backend.entities.User;

import javax.persistence.*;

@Entity
@Table(name = "user_role")
public class UserRole extends AbstractEntities {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id")
    private Role role;

    public UserRole(User user, Role role) {
        this.user = user;
        this.role = role;
    }
}
