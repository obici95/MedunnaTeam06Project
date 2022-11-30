
@DBTest
Feature: database test
  Scenario Outline: kullanici db test
    Given Kullanici connection kurar
    And Kullanici tum yeni kayitli bilgileri ceker "<query>" ve "<columnName>"
    Then Kullanici kullanici bilgilerini dogrular
    Examples:
      | query | columnName |
      |select * from jhi_user  | ssn |

