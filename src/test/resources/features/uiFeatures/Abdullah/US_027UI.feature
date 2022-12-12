@US_027
Feature: US_027 Admin can create, update, delete messages
  Background:
    Given AA User goes to "medunnaURL" homepage
  @US_27_TC_001
  Scenario: US_027 TC_001 Admin can create, update, delete messages
    Given AA "The admin" logs into the medunna page with valid credentials "adminname" and "passwordA"
    Then AA "The admin" clicks on "Items&Titles"
    And AA "The admin" clicks "Messages" button in the drop-down list
    When AA "The user" clicks on "Create a new Message"
    And AA "The admin" enters "Name" for name on the page that opens
    And AA "The admin" enters "Email" for email on the page that opens
    And AA "The admin" enters "Subject" for subject on the page that opens
    And AA "The admin" enters "Message" for message on the page that opens
    And AA "The admin" clicks on "Save" button to save
    And AA  "The admin" verifies that they can view the "message", its "author" and the "email" on the page that opens.
    And AA  "The admin" only "Edit" the verified "Message"
    And AA "The admin" enters a new "Name" for name on the page that opens
    And AA "The admin" enters a new "Email" for email on the page that opens
    And AA "The admin" enters a new "Subject" for subject on the page that opens
    And AA "The admin" enters a new "Message" for message on the page that opens
    And AA "The admin" clicks on "Save" button to save at last
    And AA  "The admin"  "Delete" the verified "Message"
