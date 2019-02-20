package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "ddlGeneratorClient",
        url = "https://s3-eu-west-1.amazonaws.com/mycujoo-assignments/",
        fallback = DDLGeneratorClientFallback.class)
public interface DDLGeneratorClient {

    /**
     * It returns all subjects from an external API
     *
     * @return String
     */
    @RequestMapping(method = RequestMethod.GET, value = "be-assignment/subjects.json", consumes = {"application/json"})
    String getAllSubjectsFromAPI();
}



