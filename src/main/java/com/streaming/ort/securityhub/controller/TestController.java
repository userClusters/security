package com.streaming.ort.securityhub.controller;

import com.streaming.ort.securityhub.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("Test")
public class TestController {
    @Autowired
    private TestService service;
    @GetMapping(value = "/main")

    private String hiMethod(@RequestParam(value = "user") String user, @RequestParam(value = "password") String password){
        return "Hi, i an cfo";
    }
}
