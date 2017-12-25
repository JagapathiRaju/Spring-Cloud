package com.techcrunchers.service.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class ServiceRest {

    @GetMapping("/service")
    public String serviceCall(){
        return "Call is from Service";
    }
}
