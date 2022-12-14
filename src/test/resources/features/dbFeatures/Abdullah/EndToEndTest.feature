@E2ETest
Feature: End To End Test
  Scenario Outline: Yeni bir kullanici olusturup kaydedilir.
    Given Kullanici, "medunnaURL" ana sayfasinda aa
    Then Kullanici, sag tarafta bulunan ikona tiklar aa
    And Kullanici, ikonun altinda acilan Register butonuna tiklar aa
    Then Kullanici, gecerli bir "<Ssn>" numarasi girer aa
    And Kullanici,gecerli bir "<firstname>" ve "<lastname>" girer aa
    And Kullanici,gecerli bir login "<username>" girer aa
    And Kullanici,gecerli bir "<email>" girer aa
    And Kullanici,gecerli bir sifre "<firstPassword>" girer aa
    And Kullanici,gecerli sifreyi "<secondPassword>" tekrar girer aa
    Then Kullanici, register butonuna basar ve basari mesajini dogrular
    Examples:
      | Ssn | firstname | lastname | username | email | firstPassword | secondPassword |
      | Ssn | firstname | lastname | username | email | firstPassword | secondPassword |

  Scenario Outline: Yeni olusturulan kullanici bilgileri database de ssn ile dogrulanır
    Given Kullanici connection kurar aa
    And Kullanici tum yeni kayitli bilgileri ceker "<query>" ve "<columnName>" aa
    Then Kullanici ssn bilgilerini dogrular aa

    Examples: test verileri
      |query    |columnName|
      |SELECT * FROM jhi_user|ssn|

  Scenario Outline: Yeni olusturulan kullanici bilgileri database de email ile dogrulanır
    Given Kullanici connection kurar aa
    And Kullanici tum yeni kayitli bilgileri ceker "<query>" ve "<columnName>" aa
    Then Kullanici email bilgilerini dogrular aa

    Examples: test verileri
      |query    |columnName|
      |SELECT * FROM public.jhi_user|email|



  Scenario: Yeni olusturulan tum kullanici bilgileri database de API ile dogrulanır
    Given Kullanici, "ssn numarali" kullanicinin tum bilgilerine GET request gonderir aa
    Then Kullanici,status kodunun 200 oldugunu dogrular aa
    And Kullanici,bilgilerin doğruluğunu kontrol eder aa
#    And Kullanici, sayfayi kapatir.

