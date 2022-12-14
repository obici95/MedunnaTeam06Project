@US15
Feature: Admin tarafindan hasta olusturma ve duzenleme

  @US15_TC01
  Scenario: US15_TC01 Admin, Items&Titles/Patients menusu altinda Create a new Patient'a tiklar
          ve yeni bir hasta olusturabilecegi Create or edit a Patient sayfasina ulasabilmelidir.

    Given LB Kullanici Medunna.com url'e gider.
    And   LB Kullanici admin olarak sign in olur.
    And   LB Kullanici Items&Titles altindaki Patients'a tiklar.
    And   LB Admin kullanici Patients sayfasinda Create a new Patients butonu gorur ve butona tiklar.
    Then  Admin kullanici Create or edit a Patient sayfasina ulastigini gorur.
    And   LB Admin kullanici sign out olur.

    @US15_TC02
    Scenario: US15_TC02 Admin Patients sayfasinda  "SSN, First Name, Last Name, Birth Date, Phone, Gender,
    Blood Group, Address,Description, Created Date, User, Country ve State / City" gibi hasta bilgilerini
    gorebilmelidir.(View button)

      Given LB Kullanici Medunna.com url'e gider.
      And   LB Kullanici admin olarak sign in olur.
      And   LB Kullanici Items&Titles altindaki Patients'a tiklar.
      And   LB Kullanci istedigi hastanin View butonuna tiklar.
      Then  LB Kullanici acilan sayfada hasta bilgilerini gorur.
      And   LB Admin kullanici sign out olur.


      @US15_TC07
      Scenario: US15_TC07 Admin Patients listesinde istedigi kayitli hastayi silebilir.(Delete Buton)
        Given LB Kullanici Medunna.com url'e gider.
        And   LB Kullanici admin olarak sign in olur.
        And   LB Kullanici Items&Titles altindaki Patients'a tiklar.
        And   LB Admin kullanici fake bir hasta kaydi olusturur.
        And   LB Admin kullanici listede fake kaydin Delete butonuna tiklar.
        And   LB Admin kullanici uyari yazisindan Delete islemini onaylar.
       Then  LB Admin kullanici  A user is deleted with identifier uyari yazisini gorur.
       Then  LB Admin kallanici kaydin Patients listesinde olmadigini dogrular.
       And   LB Admin kullanici sign out olur.
        Then LB admin kullanici kaydin silindigini API ile dogrular.










