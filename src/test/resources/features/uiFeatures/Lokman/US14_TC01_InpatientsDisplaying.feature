Feature: US14 TC01 Doktor kullanıcı yatan hasta bilgileri

  @US14_TC01 @All
  Scenario: TC01 Doktor kullanici In Patients tablosunda yatan hastalarina ait
  "ID, Start Date, End Date ,Status, Description, Created Date, Room, Appointment ve Patient" bilgilerini
  gorebilmelidir.

    Given Doktor Medunna.com url'ine gider.
    And   Doktor sign in olur.
    And   Doktor My PAGES menusu altindaki My Inpatients'a tiklar.
    Then  Doktor In Patients tablosundaki hasta bilgilerini gorur.
    And   Doktor sayfayi kapatir.