

@E2ETest
Feature: end to end test

  Scenario Outline: Register new users for Medunna
    Given user is on the registration page
    And user enters ssn number as "<SSN>"
    Then user enters firstname and lastname as "<firstname>" and "<lastname>"
    And user provides a username "<username>"
    Then user provides email id as "<email>"
    When user enters the password as "<firstpassword>"
    And user confirms the new password "<secondpassword>"
    Then user clicks on register button and sees the success message as "<message>"
    Then user reads all registrant data
    Examples:
      |SSN|firstname|lastname|username|email|firstpassword|secondpassword|message|
      |563-26-3726|Bahar|trk|sdet|bhrturk@gmail.com|Bhr@123?|Bhr@123?|Registration saved!|


  Scenario Outline: kullanici  db test ssn
    Given Kullanici connection kurar
    And Kullanici tum yeni kayitli bilgileri ceker "<query>" ve "<columnName>"
    Then Kullanici ssn bilgilerini dogrular

    Examples: test verileri
      |query    |columnName|
      |SELECT * FROM jhi_user|ssn|

  Scenario Outline: kullanici db test email
    Given Kullanici connection kurar
    And Kullanici tum yeni kayitli bilgileri ceker "<query>" ve "<columnName>"
    Then Kullanici email bilgilerini dogrular

    Examples: test verileri
      |query    |columnName|
      |SELECT * FROM public.jhi_user|email|
