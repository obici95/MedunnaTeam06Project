Feature: US14 TC02 Edit A In Patient

  @US14_TC02 @All
  Scenario: Doktor kullanici yatan hastasinin "Status" durumunu
  "UNAPPROVED, DISCHARGED,  STAYING veya CANCELLED" olarak guncelleyebilmelidir.

    Given Doktor Medunna.com url'ine gider.
    And   Doktor sign in olur.
    And   Doktor My PAGES menusu altindaki My Inpatients'a tiklar.
    And   Doktor In Patients listesinde istedigi hastanin satirindaki Edit'e tiklar.
    And   Doktor In Patient Status bilgisini istedigi sekilde gunceller.
    Then  Doktor Status bilgisinin istedigi durum oldugunu gorur