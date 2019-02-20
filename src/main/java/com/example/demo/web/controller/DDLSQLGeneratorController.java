package com.example.demo.web.controller;

import com.example.demo.service.DDLGeneratorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "DDLSQLGeneratorController", description = "Endpoint to generate DDL SQL files based on the information consumed by an external API.")
@RestController
@RequestMapping(value = "/ddl-generator", produces = MediaType.APPLICATION_JSON_VALUE)
public class DDLSQLGeneratorController {

    private final DDLGeneratorService ddlGenerationService;

    public DDLSQLGeneratorController(DDLGeneratorService ddlGenerationService) {
        this.ddlGenerationService = ddlGenerationService;
    }

    @GetMapping("/subjects")
    @ApiOperation(value = "Retrieve all Subjects", notes = "These subjects are consumed from an external API.")
    @ApiResponse(code = 200, message = "Ok")
    public ResponseEntity<String> getAllSubjectsFromAPI() {
        return ResponseEntity.ok(ddlGenerationService.getAllSubjectsFromAPI());
    }

}
