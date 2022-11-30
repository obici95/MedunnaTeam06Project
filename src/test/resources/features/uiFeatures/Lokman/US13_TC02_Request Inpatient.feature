Feature: US13_TC02 Doktor kullanıcı yatan hasta talebi olusturma

  @US13_TC02 @All
  Scenario: Doktor kullanici hastasi icin "Request Inpatient" talebi olusturabilmelidir.

    Given Doktor Medunna.com url'ine gider.
    And   Doktor sign in olur.
    And   Doktor MY PAGES menusunun altindaki My Appointments'a tiklar.
    And   Doktor acilan sayfadaki Appointments listesinde istedigi hastanin satirindaki Edit'e tiklar
    And   Doktor acilan sayfada Request Inpatient'a tiklar.
    And   Doktor ekranda islem ile ilgili mesaji gorur.
    And   Doktor My PAGES menusu altindaki My Inpatients'a tiklar.
    Then  Doktor hastasinin In Patients listesinde oldugunu gorur.
   # And   Doktor sayfayi kapatir.