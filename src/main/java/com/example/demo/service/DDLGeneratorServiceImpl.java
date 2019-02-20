package com.example.demo.service;

import com.example.demo.client.DDLGeneratorClient;
import org.springframework.stereotype.Service;

@Service
public class DDLGeneratorServiceImpl implements DDLGeneratorService {

    private final DDLGeneratorClient ddlGenerationClient;

    public DDLGeneratorServiceImpl(DDLGeneratorClient ddlGenerationClient) {
        this.ddlGenerationClient = ddlGenerationClient;
    }

    public String getAllSubjectsFromAPI() {
        return ddlGenerationClient.getAllSubjectsFromAPI();
    }
}
