package com.company.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceApp {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    private String helloWorld() {
        return "Hello World!";
    }
}
