package com.yang.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("config")
public class ConfigController {

    @Value("${user.name}")
    private String name;

    @GetMapping("name")
    public String name(){
        return name;
    }

}
