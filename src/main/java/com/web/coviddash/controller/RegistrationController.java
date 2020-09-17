package com.web.coviddash.controller;

import com.web.coviddash.entity.User;
import com.web.coviddash.dto.UserRegistrationDTO;
import com.web.coviddash.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

import static com.web.coviddash.common.ApplicationConstants.REGISTER;


/**
 * @author Mathan Raj O
 * @version 1.0
 * @since 15-09-2020
 */
@Controller
@Slf4j
@AllArgsConstructor
public class RegistrationController {

    private final UserService userService;


    /**
     * Register New User
     * @param user
     * @param result
     * @param model
     * @return
     */
    @PostMapping(REGISTER)
    public String registerUser(@ModelAttribute("userRegister") @Valid  UserRegistrationDTO user, BindingResult result, Model model)
    {
        log.info("Request received:User Registration:RegistrationController:registerUser()");
        if (result.hasErrors()) {
            return "register";
        }
        // Lookup user in database by e-mail
        UserDetails userExists = userService.findByEmail(user.getEmail());
        if (userExists != null) {
            log.error("User already registered");
            model.addAttribute("alreadyRegisteredMessage", "Oops!  There is already a user registered with the email provided.");
            model.addAttribute(new User());
            result.reject("email");
            return "register";
        }
            userService.registerUser(user);
            model.addAttribute(new User());
            model.addAttribute("confirmationMessage", "You've successfully registered to the COVID tracker!");

        return "login";

    }
}
