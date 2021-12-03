
Feature: Test GoRest Posts Api test cases including POST, DELETE, PUT, PUT
  Background: GoRst Posts Authentication token is valid

  Scenario Outline: Test the system process flow of GoRest Api
    Given Posts Api is running and returning status code 200
    When Posts Api is able to add a new Post to System with userId<user_id><title><body>
    And System should verify whether a new Post is added
    Then System is able to Clean up after a new Post was added
    And System should verify whether the Post was deleted

    Examples:
      | user_id | title         |     body                        |
      |    2    |  "Hello Bro!" | " What's up bro, how you been ?"|



