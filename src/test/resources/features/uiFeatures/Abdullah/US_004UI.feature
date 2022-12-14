@SmokeTest
Feature: Smoke Test

  Background:
    Given AA Kullanici, "medunnaURL" ana sayfasinda aa
    When AA Kullanici, sag tarafta bulunan ikona tiklar aa
    Then AA Kullanici, ikonun altinda acilan Sign in butonuna tiklar
    And AA Kullanici, Sign in pop-up'ında oldugunu dogrular



  @US04TC02
  Scenario: TC_002 Giriş yapmak için başarı mesajını doğrulayan, geçerli bir kullanıcı adı ve şifre olmalıdır.
    Then AA Kullanici, daha onceden olusturmus oldugu "gecerliKullaniciAdi"nı girer
    And AA Kullanici, daha onceden oluşturmuş oldugu "gecersizPassword"unu girer
    And AA Kullanici, Sign in butonuna tiklar
    And AA Kullanici Failed to sign in! Please check your credentials and try again. yazisini dogrular.


  @US04TC03
  Scenario: TC_003 Giriş yapmak için başarı mesajını doğrulayan, geçerli bir kullanıcı adı ve şifre olmalıdır.
    Then AA Kullanici, daha onceden olusturmus oldugu "gecersizKullaniciAdi"nı girer
    And AA Kullanici, daha onceden oluşturmuş oldugu "gecersizPassword"unu girer
    And AA Kullanici, Sign in butonuna tiklar
    And AA Kullanici Failed to sign in! Please check your credentials and try again. yazisini dogrular.

  @US04TC04
  Scenario: TC_005 Kullanıcı, 'Remember me' butonunun seçilebildiğini doğrular
    Then AA Kullanici, daha onceden olusturmus oldugu "gecerliKullaniciAdi"nı girer
    And AA Kullanici, daha onceden oluşturmuş oldugu "gecerliPassword"unu girer
    Then AA Kullanici, Remember me butonunun secilebildigini dogrular
#    And Kullanici, Sign in butonuna tiklar
#    And Kullanici basarili bir giris yaptigini dogrular.
#    And Kullanici, kullanici ismi uzerine tiklar
#    And Kullanici, kullanici ismi altinda açilan sign out butonuna tiklar
#    When Kullanici, sag tarafta bulunan ikona tiklar
#    Then Kullanici, ikonun altinda acilan Sign in butonuna tiklar
#    And Kullanici, Sign in pop-up'ında oldugunu dogrular
#    And Kullanici, username alaninda daha once girdigi ismin oldugunu dogrular

  @US04TC05
  Scenario: TC_006 Eğer şifre unutulursa diye "Did you forget your password?" seçeneği olmalıdır.
    Then AA Kullanici, Did you forget your password? butonunun oldugunu dogrular

  @US04TC06
  Scenario: TC_007 You don't have an account yet? Register a new account" seçeneği olmalıdır.
    Then AA Kullanici, You don't have an account yet? Register a new account butonunun oldugunu dogrular

  @US04TC07
  Scenario: TC_008 Cancel seçeneği olmalıdır.
    Then AA Kullanici, Cancel butonunun oldugunu dogrular

  @US04TC01
  Scenario: TC_001 Giriş yapmak için başarı mesajını doğrulayan, geçerli bir kullanıcı adı ve şifre olmalıdır.
    Then AA Kullanici, daha onceden olusturmus oldugu "gecerliKullaniciAdi"nı girer
    And AA Kullanici, daha onceden oluşturmuş oldugu "gecerliPassword"unu girer
    And AA Kullanici, Sign in butonuna tiklar
    And AA Kullanici basarili bir giris yaptigini dogrular.
    Then AA Kullanici basari mesajini dogrular
#    And Kullanici, sayfayi kapatir.

