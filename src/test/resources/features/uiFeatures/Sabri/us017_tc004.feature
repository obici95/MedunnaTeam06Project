Feature: US017 Test items(öğe) Oluştur / Güncelle / Sil
  Scenario: TC04 Admin test öğelerini silebilir.
    Given SG Admin Medunna url'ine gider
    Then SG Admin Sign In sayfasına gider
    And  SG Admin Kullanıcı bilgileriyle sign in olunur
    Then SG Admin Items&Titles sekmesini tıklar
    And SG Admin açılan menüden Test Item butonunu tıklar
    Then SG Admin açılan sayfadan test öğelerini siler
    And SGG Sayfayi kapatir