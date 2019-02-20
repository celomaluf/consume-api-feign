package com.example.bdd;

import cucumber.api.java.Before;
import cucumber.api.java8.En;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

public class DDLGenaratorStepDef extends StepDefs implements En {

    private final WebApplicationContext webApplicationContext;
    private String resultAsString = "";

    public DDLGenaratorStepDef(WebApplicationContext webApplicationContext) {
        this.webApplicationContext = webApplicationContext;
        bdd();
    }

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    private void bdd() {
        consumeSubjectsRegarding();
    }

    private void consumeSubjectsRegarding() {

        Given("^The Demo GETs the subjects from The a relative URL$", () -> {
        });
        When("^The request is made$", () -> {
            result = mockMvc.perform(
                    get("/ddl-generator/subjects"))
                    .andDo(print()).andReturn();
        });
        Then("^Acceptance from external API$", () -> {
            assertEquals(result.getResponse().getStatus(), HttpStatus.OK.value());
            resultAsString = result.getResponse().getContentAsString();
        });
        And("^The external API retrieves the subjects information$", () -> {
            assertTrue(resultAsString.length() > 0);
        });
    }
}
