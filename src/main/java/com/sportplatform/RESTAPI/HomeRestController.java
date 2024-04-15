package com.sportplatform.RESTAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {
    @GetMapping("/home")
    public String getHome(){
        return "Hello World";
    }
}
