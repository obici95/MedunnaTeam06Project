
@US_27_API
Feature: User should validate creating and reading messages using API
  @US_27_API_TC_001
  Scenario:User Sends a post request
  Given AA The user sets the URL
  When AA The user sets expected data
  And AA The user sends a post request and gets the response
  Then AA The user does assertion
  @US_27_API_TC_002
Scenario: User Sends a get request
  Given AA The user sets the URL for get request
  When AA The user sets expected data for get request
  And AA The user sends a get request and gets the response
  Then AA The user does assertion for get request

