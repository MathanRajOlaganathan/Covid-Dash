package com.web.coviddash.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import static com.web.coviddash.common.ApplicationConstants.LOGIN;
import static com.web.coviddash.common.ApplicationConstants.REGISTER;


/**
 * @author Mathan Raj O
 * @version 1.0
 * @since 15-09-2020
 */
@Controller
@Slf4j
public class HomeController {

    @GetMapping(value = {"/",LOGIN})
    public String goToLogin()
    {
        log.info("Request Received for the Login Page: inside goToLogin()");
        return "login";
    }

    @GetMapping(REGISTER)
    public String goToRegistration()
    {
        log.info("Request Received for the Registration Page:inside goToRegistration()");
        return "register";
    }

}



