package com.odd.jobs.oddjobs.custom.exceptionhandlers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.odd.jobs.oddjobs.restcontrollers.SignupRestController;

@ControllerAdvice(basePackageClasses = {SignupRestController.class})
public class SignupExceptionHandler extends ResponseEntityExceptionHandler{    
    
}
