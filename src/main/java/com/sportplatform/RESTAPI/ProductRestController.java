package com.sportplatform.RESTAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("product")
public class ProductRestController {
    @GetMapping
    public String getProduct() {
        return "Get Product";
    }
}
