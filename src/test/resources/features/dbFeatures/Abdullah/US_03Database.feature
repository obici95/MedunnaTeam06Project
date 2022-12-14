
@DBTest
Feature: Database Test : Kullanici, bilgileri dogrulanir.
  Scenario Outline: Kullanici, yeni olusturulan kullanici bilgilerini dogrular.
    Given Kullanici connection kurar aa
    And Kullanici tum yeni kayitli bilgileri ceker "<query>" ve "<columnName>" aa
    Then Kullanici "<SSN>" bilgilerini dogrular aa
    Examples:
      | query | columnName | SSN |
      | select * from jhi_user | ssn |111-22-3333|

