package com.anonimeitos.anonimeitosSetup.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public String helloWWorld(String name) {
        return "Hello, World! " + name;
    }
}
