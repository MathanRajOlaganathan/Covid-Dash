package com.web.coviddash.service;

import com.web.coviddash.dto.UserRegistrationDTO;
import com.web.coviddash.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author Mathan Raj O
 * @version 1.0
 * @since 15-09-2020
 */
public interface UserService extends UserDetailsService {

    public User findByEmail(String email);

    public User registerUser(UserRegistrationDTO user);
}
