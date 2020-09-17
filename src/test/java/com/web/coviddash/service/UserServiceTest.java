package com.web.coviddash.service;

import com.web.coviddash.entity.User;
import com.web.coviddash.entity.UserRole;
import com.web.coviddash.repository.UserRepository;
import com.web.coviddash.serviceimpl.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import static org.junit.Assert.assertNotNull;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    private UserServiceImpl userServiceMock;

    private UserRepository userRepositoryMock;

    @Before
    public void setUp() {
        userRepositoryMock = Mockito.mock(UserRepository.class);
        userServiceMock = new UserServiceImpl();
        userServiceMock.setUserRepository(userRepositoryMock);
    }

    @Test
    public void findByEmailSuccessfuly() throws Exception {

        User user = (new User(null,"test@gmail.com","password","xxx","yyy", UserRole.USER,false,false));
        when(userRepositoryMock.findByEmail("test@gmail.com")).thenReturn(user);

        User usr = userServiceMock.findByEmail("test@gmail.com");
        assertEquals("xxx", user.getFirstName());
        assertNotNull(user.getLastName());
    }

    @Test(expected = UsernameNotFoundException.class)
    public void loadUserByUsername() throws Exception {
        doThrow(new UsernameNotFoundException("User with email {0} cannot be found")).when(userRepositoryMock).findByEmail(eq("test@gmail.com"));

        userServiceMock.loadUserByUsername("test@gmail.com");
    }
}
