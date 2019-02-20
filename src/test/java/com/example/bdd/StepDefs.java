package com.example.bdd;

import com.example.demo.DemoApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = DemoApplication.class)
public abstract class StepDefs {

    protected MockMvc mockMvc;
    protected MvcResult result;

}

