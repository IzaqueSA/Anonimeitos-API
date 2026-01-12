package com.anonimeitos.anonimeitosSetup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anonimeitos.anonimeitosSetup.domain.User;
import com.anonimeitos.anonimeitosSetup.service.MyService;

@RestController
@RequestMapping("/hello-world")
public class MyController {

    @Autowired
    MyService helloWorldService;

    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWWorld("User");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable String id, @RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body) {
        return "Hello, World! POST " + body.getUsername() + " " + id + " " + filter;
    }
}
