package com.example.test.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExController {

    @GetMapping(value = "/te")
    public String mesaj(){
        return "ffff";
    }
}
