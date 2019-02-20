package com.example.demo.client;

import org.springframework.stereotype.Component;

@Component
public class DDLGeneratorClientFallback implements DDLGeneratorClient {

    @Override
    public String getAllSubjectsFromAPI() {
        return "Couldn't reach API";
    }
}
