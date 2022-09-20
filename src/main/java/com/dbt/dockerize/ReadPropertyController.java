package com.dbt.dockerize;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ReadPropertyController {

    @Value("${dbt.message}")
    String message;
    
    @GetMapping("/message")
    public String getMessageByProfile(){
        return this.message;
    }
}
