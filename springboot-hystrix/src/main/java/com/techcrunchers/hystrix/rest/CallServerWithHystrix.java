package com.techcrunchers.hystrix.rest;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/hystrix")
public class CallServerWithHystrix  {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(groupKey = "fallback", commandKey = "fallback", fallbackMethod = "toDefaultCallServer")
    @GetMapping("/callServer")
    public String callServer() {
        //Below URL Don't exits so by default it will call  toDefaultCallServer Method.
        return restTemplate.getForEntity("http://localhost:8081/rest/callServer", String.class ).getBody();
    }

    public String toDefaultCallServer() {
        return "I am from FallBack Hystrix";
    }
}
