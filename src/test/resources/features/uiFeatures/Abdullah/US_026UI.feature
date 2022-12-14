@US_26
Feature: US_026 Contact messages

  Background:
    Given AA User goes to "medunnaURL" homepage

  @US_26_TC_001
  Scenario: US_26 TC_001 Any user who would like to have info or describe a concern can use Contact portal to provide
    When AA "Unregistered" clicks on "CONTACT"
    And AA "Unregistered" enters "Name" for name
    And AA "Unregistered" enters "Email" for e-mail
    And AA "Unregistered" enters "Subject" for subject
    And AA "Unregistered" enters "Message" for message
    And AA "Unregistered" clicks on "Send" button
    Then AA "Unregistered" confirms that "Your message has been received"
  @US_26_TC_001
  Scenario: US_27 TC_005 User should validate messages with DB
    Given AA The user connects to database
    When AA The user pulls relevant message information from the database
    Then AA The user validates message information from coming to the database
  @US_26_TC_001
  Scenario: US_27 TC_001 Admin can go to messages portal and view all messages, their authors and emails
    Given AA "The admin" logs into the medunna page with valid credentials "adminname" and "passwordA"
    Then AA "The admin" clicks on "Items&Titles"
    And AA "The admin" clicks "Messages" button in the drop-down list
    And AA  "The admin" verifies that they can view the "message", its "author" and the "email" on the page that opens.
    And AA  "The admin"  "Delete" the verified "Message"

  @US_26_TC_002
  Scenario: US_26 TC_002 Any user who would like to have info or describe a concern can use Contact portal to provide
    Given AA "The user" logs into the medunna page with valid credentials "username" and "passwordU"
    When AA "The user" clicks on "CONTACT"
    And AA "The user" enters "Name" for name
    And AA "The user" enters "Email" for e-mail
    And AA "The user" enters "Subject" for subject
    And AA "The user" enters "Message" for message
    And AA "The user" clicks on "Send" button
    Then AA "The user" confirms that "Your message has been received"
  @US_26_TC_002
  Scenario: US_27 TC_005 User should validate messages with DB
    Given AA The user connects to database
    When AA The user pulls relevant message information from the database
    Then AA The user validates message information from coming to the database
  @US_26_TC_002
  Scenario: US_27 TC_001 Admin can go to messages portal and view all messages, their authors and emails
    Given AA "The admin" logs into the medunna page with valid credentials "adminname" and "passwordA"
    Then AA "The admin" clicks on "Items&Titles"
    And AA "The admin" clicks "Messages" button in the drop-down list
    And AA  "The admin" verifies that they can view the "message", its "author" and the "email" on the page that opens.
    And AA  "The admin"  "Delete" the verified "Message"

  @US_26_TC_003
  Scenario: US_26 TC_003 Any user who would like to have info or describe a concern can use Contact portal to provide
    Given AA "The patient" logs into the medunna page with valid credentials "patientname" and "passwordP"
    When AA "The patient" clicks on "CONTACT"
    And AA "The patient" enters "Name" for name
    And AA "The patient" enters "Email" for e-mail
    And AA "The patient" enters "Subject" for subject
    And AA "The patient" enters "Message" for message
    And AA "The patient" clicks on "Send" button
    Then AA "The patient" confirms that "Your message has been received"
  @US_26_TC_003
  Scenario: US_27 TC_005 User should validate messages with DB
    Given AA The user connects to database
    When AA The user pulls relevant message information from the database
    Then AA The user validates message information from coming to the database
  @US_26_TC_003
  Scenario: US_27 TC_001 Admin can go to messages portal and view all messages, their authors and emails
    Given AA "The admin" logs into the medunna page with valid credentials "adminname" and "passwordA"
    Then AA "The admin" clicks on "Items&Titles"
    And AA "The admin" clicks "Messages" button in the drop-down list
    And AA  "The admin" verifies that they can view the "message", its "author" and the "email" on the page that opens.
    And AA  "The admin"  "Delete" the verified "Message"

  @US_26_TC_004
  Scenario: US_26 TC_004 Any user who would like to have info or describe a concern can use Contact portal to provide
    Given AA "The physician" logs into the medunna page with valid credentials "physicianname" and "passwordP"
    When AA "The physician" clicks on "CONTACT"
    And AA "The physician" enters "Name" for name
    And AA "The physician" enters "Email" for e-mail
    And AA "The physician" enters "Subject" for subject
    And AA "The physician" enters "Message" for message
    And AA "The physician" clicks on "Send" button
    Then AA "The physician" confirms that "Your message has been received"
  @US_26_TC_004
  Scenario: US_27 TC_005 User should validate messages with DB
    Given AA The user connects to database
    When AA The user pulls relevant message information from the database
    Then AA The user validates message information from coming to the database
  @US_26_TC_004
  Scenario: US_27 TC_001 Admin can go to messages portal and view all messages, their authors and emails
    Given AA "The admin" logs into the medunna page with valid credentials "adminname" and "passwordA"
    Then AA "The admin" clicks on "Items&Titles"
    And AA "The admin" clicks "Messages" button in the drop-down list
    And AA  "The admin" verifies that they can view the "message", its "author" and the "email" on the page that opens.
    And AA  "The admin"  "Delete" the verified "Message"

  @US_26_TC_005
  Scenario: US_26 TC_005 Any user who would like to have info or describe a concern can use Contact portal to provide
    Given AA "The staff" logs into the medunna page with valid credentials "staffname" and "passwordS"
    When AA "The staff" clicks on "CONTACT"
    And AA "The staff" enters "Name" for name
    And AA "The staff" enters "Email" for e-mail
    And AA "The staff" enters "Subject" for subject
    And AA "The staff" enters "Message" for message
    And AA "The staff" clicks on "Send" button
    Then AA "The staff" confirms that "Your message has been received"
  @US_26_TC_005
  Scenario: US_27 TC_005 User should validate messages with DB
    Given AA The user connects to database
    When AA The user pulls relevant message information from the database
    Then AA The user validates message information from coming to the database
  @US_26_TC_005
  Scenario: US_27 TC_001 Admin can go to messages portal and view all messages, their authors and emails
    Given AA "The admin" logs into the medunna page with valid credentials "adminname" and "passwordA"
    Then AA "The admin" clicks on "Items&Titles"
    And AA "The admin" clicks "Messages" button in the drop-down list
    And AA  "The admin" verifies that they can view the "message", its "author" and the "email" on the page that opens.
    And AA  "The admin"  "Delete" the verified "Message"

  @US_26_TC_006
  Scenario: US_26 TC_006 Any user who would like to have info or describe a concern can use Contact portal to provide
    Given AA "The admin" logs into the medunna page with valid credentials "adminname" and "passwordA"
    When AA "The admin" clicks on "CONTACT"
    And AA "The admin" enters "Name" for name
    And AA "The admin" enters "Email" for e-mail
    And AA "The admin" enters "Subject" for subject
    And AA "The admin" enters "Message" for message
    And AA "The admin" clicks on "Send" button
    Then AA "The admin" confirms that "Your message has been received"
  @US_26_TC_006
  Scenario: US_27 TC_005 User should validate messages with DB
    Given AA The user connects to database
    When AA The user pulls relevant message information from the database
    Then AA The user validates message information from coming to the database
  @US_26_TC_006
  Scenario: US_27 TC_001 Admin can go to messages portal and view all messages, their authors and emails
    Given AA "The admin" logs into the medunna page with valid credentials "adminname" and "passwordA"
    Then AA "The admin" clicks on "Items&Titles"
    And AA "The admin" clicks "Messages" button in the drop-down list
    And AA  "The admin" verifies that they can view the "message", its "author" and the "email" on the page that opens.
    And AA  "The admin"  "Delete" the verified "Message"

