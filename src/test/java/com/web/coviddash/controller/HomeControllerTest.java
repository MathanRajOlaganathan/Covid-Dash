package com.web.coviddash.controller;

import com.web.coviddash.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.notNullValue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * @author Mathan Raj O
 * @version 1.0
 * @since 15-09-2020
 */
@WebMvcTest(controllers = HomeController.class)
public class HomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    public void checkRegister() throws Exception {
        mockMvc.perform(get("/register"))
                .andExpect(model().attribute("userRegister", notNullValue()))
                .andExpect(view().name("register"));
    }
    @Test
    public void checkLogin() throws Exception {
        mockMvc.perform(get("/login")).andExpect(status().isOk())
                .andExpect(model().attribute("login", notNullValue()))
                .andExpect(view().name("login"));
    }


}
