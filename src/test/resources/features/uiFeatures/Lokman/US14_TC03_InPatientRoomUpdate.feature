Feature: US14 TC03 Update room.

  @US14_TC03
  Scenario: Doktor kullanici yatan hastasinin rezerve edilmis oda numarasini guncelleyebilmeli
    Given Doktor Medunna.com url'ine gider.
    And   Doktor sign in olur.
    And   Doktor My PAGES menusu altindaki My Inpatients'a tiklar.
    And   Doktor In Patients listesinde istedigi hastanin satirindaki Edit'e tiklar.
    And   Doktor acilan sayfadaki room seceneginden istedigi Available bir oda secer.
  #  And   Doktor Save butonuna tiklar.
   # Then  Doktor ekranda islem ile ilgili mesaji gorur.
    #And   Doktor My PAGES menusu altindaki My Inpatients'a tiklar.
    #Then  Dokror In Patients listesinde hastasinin oda numarasini gorur.