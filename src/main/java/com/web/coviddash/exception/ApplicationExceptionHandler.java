package com.web.coviddash.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author Mathan Raj O
 * @version 1.0
 * @since 15-09-2020
 */
@ControllerAdvice
@Slf4j
public class ApplicationExceptionHandler {

    @ExceptionHandler({Exception.class})
    public String handleException(Exception ex) {
        log.info("In Covid-Dash exception handler: "+ex.toString());
        return "error";
    }
}
