package com.sportplatform.RESTAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/home")
public class HomeRestController {
    @GetMapping
    public String getHome(){
        return "Hello World";
    }
}
