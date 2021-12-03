Feature: GoRest User api testcases including POST, PUT, GET and DELETE methods

  Background: GoRest User API authentication token is valid
    # Comments

  Scenario Outline: Test the proccess flow of User API
    Given User api is working and returning 200 status code
    When User wants to add a new user with <name>,<email>,<gender>, and <status>
    And System can verify the new user is added successfully
    Then System should cleanUp a new user data
    And System should verify that test data user is removed successfully;

    Examples:
      |name           | email                  |   gender   | status  |
      |"TestUserM41"  | "test11M41User@demo.com" |  "male"    | "active"|
      |"TestUserM42"  | "test22M42User@demo.com" |  "male"    | "active"|
      |"TestUserM43"  | "testM4223User@demo.com" |  "male"    | "active"|

    Scenario Outline: Process flow to update user information
      Given User api is working and returning 200 status code
      When User wants to add a new user with <name>,<email>,<gender>, and <status>
      Then USer wants to update the <updatedEmail> in user details
      And System can verify the new user is added successfully
      Then System should cleanUp a new user data
      And System should verify that test data user is removed successfully;

      Examples:
      | name             | email                  |  gender    | status   | updatedEmail                           |
      | "Everythfeklfj" | "test11M41User@demo.com" | "female"   | "active" |  "fdsasde24dfssd43534eewrte343fdh@gmail.com"|


