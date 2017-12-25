package com.techcrunchers.client.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@RestController
@RequestMapping("/rest")
public class ClientRest {
    @Autowired
    RestTemplate restTemplate;

    Logger LOGGER = Logger.getLogger("ClientRest");

    @GetMapping("/callService")
    public String callService(){
        LOGGER.info("In Side Client Service");
        return this.restTemplate.getForEntity("http://localhost:8081/rest/service",String.class).getBody();
    }
}
