package com.web.coviddash.serviceimpl;

import com.web.coviddash.dto.UserRegistrationDTO;
import com.web.coviddash.entity.User;
import com.web.coviddash.repository.UserRepository;
import com.web.coviddash.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;

/**
 * @author Mathan Raj O
 * @version 1.0
 * @since 15-09-2020
 */
@Service
public class UserServiceImpl implements UserService {
    private  UserRepository userRepository;

    private  BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    public void setbCryptPasswordEncoder(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        final User user = userRepository.findByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException(MessageFormat.format("User with email {0} cannot be found.", email));
        }
        return user;
    }

    public User registerUser(UserRegistrationDTO registration) {
        User user = new User();
        user.setFirstName(registration.getFirstName());
        user.setLastName(registration.getLastName());
        user.setEmail(registration.getEmail());
        user.setPassword(bCryptPasswordEncoder.encode(registration.getPassword()));
        user.setEnabled(true);
        return userRepository.save(user);

    }


}
