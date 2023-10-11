package com.assest.assest.service;


import com.assest.assest.dto.UserRegistrationDto;
import com.assest.assest.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}