Feature: US_026 Contact messages

  Background:
    Given AA User goes to "medunnaURL" homepage
  @tc_001
  Scenario: US_26 TC_001 Any user who would like to have info or describe a concern can use Contact portal to provide
    When AA "Unregistered" clicks on "CONTACT"
    And AA "Unregistered" enters "Name" for name
    And AA "Unregistered" enters "Email" for e-mail
    And AA "Unregistered" enters "Subject" for subject
    And AA "Unregistered" enters "Message" for message
    And AA "Unregistered" clicks on "Send" button
    Then AA "Unregistered" confirms that "Your message has been received"

  Scenario: US_27 TC_001 Admin can go to messages portal and view all messages, their authors and emails
    Given AA "The admin" logs into the medunna page with valid credentials "adminname" and "passwordA"
    Then AA "The admin" clicks on "Items&Titles"
    And AA "The admin" clicks "Messages" button in the drop-down list
    And AA  "The admin" verifies that they can view the "message", its "author" and the "email" on the page that opens.
    And AA  "The admin"  "Delete" the verified "Message"
