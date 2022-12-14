
@US20_Tests
Feature: US20 Admin User Management Menusu

  @US20_TC01
  Scenario: US20_TC01_Admin, user management altinda View butonuna tikladiginda  kayitli
              kisilerin "login, firstname, lastname, email... " gibi bilgilerini gorebilmeli.

    Given LB Kullanici Medunna.com url'e gider.
    And   LB Kullanici admin olarak sign in olur.
    And   LB Admin kullanici Administration altinda User management'a tiklar.
    And   LB Admin kullanici Users listesinden istedigi kaydin View butonuna tiklar.
    Then  LB Admin kullanici acilan sayfada kayitli kisinin bilgilerini gorur.
    And   LB Admin kullanici sign out olur.
    And   LB Admin kullanici sayfayi kapatir.


    @US20_TC02
    Scenario: US20_TC02_Admin, user management altinda  kayitli kisileri Active/Deactive edebilir.
      Given LB Kullanici Medunna.com url'e gider.
      And   LB Kullanici fake bir kayitli kullanici olusturur.
      And   LB Kullanici admin olarak sign in olur.
      And   LB Admin kullanici Administration altinda User management'a tiklar.
      And   LB Admin kullanici Users listesinde fake kullanicinin Deactivated butonuna tiklar.
      Then  LB Admin kullanici fake kaydin Activated oldugunu gorur.
      And   LB Admin kullanici sign out olur.
      And   LB Admin kullanici sayfayi kapatir.


      @US20_TC03
      Scenario: US20_TC03_Admin, user management altindaki Edit butonu ile kayitli kisileri Active/Deactive
      edebilir ve Edit ile rollerini "ADMIN, USER, PATIENT, STAFF ve PHYSICIAN"  olarak atayabilir.
        Given LB Kullanici Medunna.com url'e gider.
        And   LB Kullanici fake bir kayitli kullanici olusturur.
        And   LB Kullanici admin olarak sign in olur.
        And   LB Admin kullanici Administration altinda User management'a tiklar.
        And   LB Admin Users listesindeki fake kaydin Edit butonuna tiklar.
        And   LB Admin kullanici Create or edit a user sayfasindaki Activated checkbox'a tiklar.
        And   LB Admin kullanici Profiles selectbox'ta fake kayda istedigi rolu atar.
        And   LB Admin kullanici Save butonuna tiklar.
        Then  LB Admin kullanici  A user is updated with yazisini gorur.
        Then  LB Admin kullanici fake kaydin Activated oldugunu ve sectigi rolu Profiles sutunuda gorur.
        Then  LB Admin kullanici sign out olur.


        @US20_TC04
        Scenario: US20_TC04_Admin, user management altinda kayitli kullanicilari silebilir.
          Given LB Kullanici Medunna.com url'e gider.
          And   LB Kullanici fake bir kayitli kullanici olusturur.
          And   LB Kullanici admin olarak sign in olur.
          And   LB Admin kullanici Administration altinda User management'a tiklar.
          And   LB Admin Users listesinde fake kaydin Delete butonuna tiklar.
          And   LB Admin kullanici acilan "Confirm delete operation" uyari yazisinda delete islemini onaylar.
          Then  LB Admin kullanici  A user is deleted with identifier yazisini gorur.
         Then   LB Admin kullanici fake kaydin Users listesinden silindigini gorur.
         And    LB Admin kullanici sayfayi kapatir.


