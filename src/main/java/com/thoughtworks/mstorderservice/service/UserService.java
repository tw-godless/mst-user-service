package com.thoughtworks.mstorderservice.service;

import com.thoughtworks.mstorderservice.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User getUserAddress(String userName);
}
