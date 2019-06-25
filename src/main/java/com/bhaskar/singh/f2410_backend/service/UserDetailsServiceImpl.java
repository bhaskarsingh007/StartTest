package com.bhaskar.singh.f2410_backend.service;

import com.bhaskar.singh.f2410_backend.entities.User;
import com.bhaskar.singh.f2410_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userRepository.findUserByEmail(userName);
        if(user == null)
            throw new UsernameNotFoundException;
        return new org.springframework.security.core.userdetails.User()
    }
}
