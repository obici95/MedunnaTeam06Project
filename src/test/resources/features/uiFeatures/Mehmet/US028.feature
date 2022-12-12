Feature: US028 Country creation / update / read and Delete by Admin


    Background: : Admin giris yapar
      Given Kullanici url'e gider
      Then kullanici insan ikonuna tıklar
      And kullanici  gecerli username ve gecerli password girer
      And Sign in butonuna tiklar

    Scenario Outline:TC01 Kullanici yeni bir ülke olusturabilir
      Given kullanici admin sayfasının goruntulendigini dogrular
      Then  kullanici items and titles dropdown menu butonuna  tıklar
      Then  kullanici country butonuna tıklar
      Then  kullanici country sayfasinin goruntulendigini dogrular
      Then  kullanici create a new Country buttonuna tıklar
      Then  kullanici Create or edit a Country sayfasinin goruntulendigini dogrular
      Then  kullanıcı textboxa "<country ismi>" girer
      Then  kullanici  Create or edit a Country sayfasındaki  save button tiklar
      And   kullanici a new country is created mesajinin goruntulendigini dogrular
      And   kullanici sayfayi kapatir.

       Examples:

         | country ismi |
         | COMOLOKKO2   |

    Scenario: TC02 Kullanıcı yeni bir ülke ismi olustururken ozel karakter kullanamamalı
      Given  kullanici items and titles dropdown menu butonuna  tıklar
      Then   kullanici country butonuna tıklar
      Then   kullanici create a new Country buttonuna tıklar
      Then   kullanici textboxa "AB!&+()Z" gönderir
      Then   kullanici  Create or edit a Country sayfasındaki  save button tiklar
      And    kullanici a new country is created mesajinin goruntulenmedigini dogrular
      And    kullanici sayfayi kapatir.



  Scenario: TC03 Kullanıcı, ülkeye göre ilgili eyaletler veya şehirler oluşturabilmelidir.
      Given  kullanici items and titles dropdown menu butonuna  tıklar
      Then   kullanici stateCity butonuna tiklar
      Then   kullanici stateCity sayfasinin acildigini dogrular
      Then   kullanici create a new StateCity buttona tiklar
      Then   kullanici name textboxa "Lokko" ismi gonderir
      Then   kullanici StateCity drop down dan CountyName secer.
      Then   kullanici StateCity Save butonuna tiklar
      And    kullanici a new CityState is created mesajini goruntulendigini dogrular
      And    kullanici sayfayi kapatir.

  Scenario: TC04 kullanici ülkeleri silebilir
    Given  kullanici items and titles dropdown menu butonuna  tıklar
    Then   kullanici country butonuna tıklar
    Then   kullanici listeden silmek istedigi ulkenin delete butonuna tiklar
    Then   kullanici silme islemini delete butonuna tiklayarak onaylar
    Then   kullanici silme isleminin basarili oldugu mesajinin goruntulendigini dogrular
    And    kullanici sayfayi kapatir.


    Scenario: TC05 kullanici ülkeleri editleyebilir
      Given  kullanici items and titles dropdown menu butonuna  tıklar
      Then   kullanici country butonuna tıklar
      Then   kullanici listeden editlemek istedigi ulkenin Edit butonuna tiklar
      Then   kullanici name textboxa random ulke ismi girer
      Then   kullanici CountryEdit sayfasindaki Save butonuna tiklar
      And    kullanici A Country is updated with identifier mesajinin goruntulendigini dogrular
      And    kullanici sayfayi kapatir.











