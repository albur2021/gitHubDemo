Feature: Get User Api test case
  Background: User api is working as expected
    Scenario: User api calll with list of all users
      Given System calls user api with valid url
      When User api return response with status code 200
      Then System should validate api response