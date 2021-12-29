package com.dailycodebuffer.cloud.gateway;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {


    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod() {

        return "User service is taking longer then Expected." + "Please try again later.";

    }


    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBackMethod() {

        return "department service is taking longer then Expected." + "Please try again later.";
    }
}