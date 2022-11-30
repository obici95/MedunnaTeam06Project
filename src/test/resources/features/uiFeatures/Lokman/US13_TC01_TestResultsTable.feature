Feature: US13_TC01_Doktor Kullanıcı Test Sonuclari Tablosu

  @US13_TC01 @All
  Scenario: TC01 Doktor kullanici hastasinin test sonuclarini goruntulediginde
        test sonuc tablosunda " id, name(Urea, Sodium, Glucose vb..), default max value, default min value,
        test, description ve  date" bilgilerini gorebilmeli

    Given Doktor Medunna.com url'ine gider.
    And   Doktor sign in olur.
    And   Doktor MY PAGES menusunun altindaki My Appointments'a tiklar.
    And   Doktor acilan sayfadaki Appointments listesinde istedigi hastanin satirindaki Edit'e tiklar
    And   Doktor acilan sayfada Show Test Results'a tiklar
    And   Doktor acilan sayfadaki Tests listesinden ilgili teste ait View Results'a tiklar.
    Then  Doktor Test Resulst tablosunda test bilgilerini gorur.
    And   Doktor sayfayi kapatir.





