Feature: US006 Kullanıcı bilgisi sekmesi (Setting) ana Sayfada düzenlenebilir olmalıdır.
  Scenario: TC02to04 "Firstname, lastname ve email" bilgileri güncelleme seçeneği olmalıdır.
    Given SG Kullanici Medunna url'ine gider
    Then SG Kullanici Sign In sayfasına gider
    And SG Kullanici bilgileriyle sign in olur
    Then SG Profil menüsünden Settings butonu tıklanır
    And SG Firstname, lastname ve email metin kutularinda degisiklik yapar
    Then SG Firstname, lastname ve email metin kutularinda yapilan degisiklikleri dogrular
    And SG Sayfayi kapatir
