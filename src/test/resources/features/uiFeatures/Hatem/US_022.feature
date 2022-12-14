@US_22_StepDefinition
Feature: Hasta Test sonuçları (Staff)

  @US_22_TC01
  Scenario: Kullanıcı (Staff) hastanın SSN id ile arama yapabilir.

  And Kullanici Medunna Url sitesine gider
  And Kullanici Sign In DropDown menuye Tiklar
  And Kullanici Gecerli Staff UserName ve UserPassword girer Sign in olur
  And Staff  My Pages sekmesine tiklar ve Search Patient sekmesine tiklar
  And Staff Patient SSN searchbox ina tiklar ve Aranan Hastayi bulur

  And Staff Show Appointmens buttonuna tiklar
  And Gelen Appointments sayfasindan Show test te tiklar
  And Staff boylelikle Hastanin test sonuclarini gorur.
    Scenario:

      And Kullanici Medunna Url sitesine gider
      And  Staff edit  buttonuna tiklar
      And Staff Hasta bilgilerini gorur ve duzenler
      And Staff sayfayi kapatir








