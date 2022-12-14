Feature: US017 Test items(öğe) Oluştur / Güncelle / Sil
  Scenario: TC03 Admin test öğelerini görüntüleyebilir.
    Given SG Admin Medunna url'ine gider
    Then SG Admin Sign In sayfasına gider
    And  SG Admin Kullanıcı bilgileriyle sign in olunur
    Then SG Admin Items&Titles sekmesini tıklar
    And SG Admin açılan menüden Test Item butonunu tıklar
    Then SG Admin açılan sayfadan test öğelerini görüntüler.
    And SGG Sayfayi kapatir