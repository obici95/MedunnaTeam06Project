@postApiRequest
Feature: Room post testi

  Scenario: test room api
    Given user send a post request for rooms
    And user gets the room data and validates