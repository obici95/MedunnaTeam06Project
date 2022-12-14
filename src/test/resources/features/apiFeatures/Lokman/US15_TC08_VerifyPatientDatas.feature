Feature: Hasta biligilerini dogrulama


  @US15_08 @US15
  Scenario: US15_TC08 Hasta bilgileri dogrulama
    Given LB Kullanici hasta IP nosu ile get request yollar.
    Then  LB Kullanici hasta bilgilerini alir ve dogrular.