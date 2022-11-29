Feature: US006 Kullanıcı bilgisi sekmesi (Setting) ana Sayfada düzenlenebilir olmalıdır.
  Scenario: TC01 Kullanıcı bilgileri "firstname, lastname, email" girerken doldurulan kullanıcı bilgileri olmalıdır.
    Given SG Kullanici Medunna url'ine gider
    Then SG Kullanici Sign In sayfasına gider
    And SG Kullanici bilgileriyle sign in olur
    Then SG Profil menüsünden Settings butonu tıklanır
    And SG Kullanıcı bilgilerinin firstname, lastname, email giriş yaparken doldurulan kullanıcı bilgileri olduğunu dogrular
    And SG Sayfayi kapatir
