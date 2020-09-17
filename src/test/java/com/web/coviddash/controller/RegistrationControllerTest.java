package com.web.coviddash.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.web.coviddash.dto.UserRegistrationDTO;
import com.web.coviddash.entity.User;
import com.web.coviddash.service.UserService;
import org.apache.http.client.UserTokenHandler;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * @author Mathan Raj O
 * @version 1.0
 * @since 15-09-2020
 */
@WebMvcTest(controllers = RegistrationController.class)
public class RegistrationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private  UserService userService;

    @MockBean
    private User userDetails;

    @MockBean
    private UserRegistrationDTO user;

    @Before
    private void setup()
    {
        when(userService.findByEmail("new@memorynotfound.com")).thenReturn(userDetails);
        when( userService.registerUser(user)).thenReturn(userDetails);
    }



    @Test
    public void submitRegistrationSuccess() throws Exception {
        mockMvc
                .perform(
                        post("/registration")
                                .param("firstName", "XXX")
                                .param("lastName", "yyy")
                                .param("email", "new@memorynotfound.com")
                                .param("password", "xjD1!3djk4")
                                .param("terms", "on")
                                .with(csrf()))
                .andExpect(status().is3xxRedirection());
    }

}
