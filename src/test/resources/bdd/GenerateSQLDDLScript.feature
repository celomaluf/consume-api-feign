Feature: For each subject from the list, fetch and parse its schema definition.
         For each fetched schema, generate a  CREATE TABLE  SQL command based on the  fields
         described in the definition.

  Scenario: The Demo needs to consume subjects data from an external API
    Given The Demo GETs the subjects from The a relative URL
    When The request is made
    Then Acceptance from external API
      And The external API retrieves the subjects information

