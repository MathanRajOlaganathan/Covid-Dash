package com.web.coviddash.controller;
import com.web.coviddash.entity.Login;
import com.web.coviddash.dto.UserRegistrationDTO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;


/**
 * @author Mathan Raj O
 * @version 1.0
 * @since 15-09-2020
 */
@ControllerAdvice
public class DefaultModelAttributeController {

    @ModelAttribute("userRegister")
    public UserRegistrationDTO getDefaultUser()
    {
        return new UserRegistrationDTO();
    }

    @ModelAttribute("login")
    public Login getDefaultLogin()
    {
        return new Login();
    }
}
