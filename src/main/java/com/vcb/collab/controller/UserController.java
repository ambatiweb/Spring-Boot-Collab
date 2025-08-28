package com.vcb.collab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/collab/api/v1")
public class UserController {
    @GetMapping("/")
    public String getMessage(){
        return "Hello there in am user controller";
    }
}
