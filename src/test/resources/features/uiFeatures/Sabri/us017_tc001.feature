Feature: US017 Test items(öğe) Oluştur / Güncelle / Sil
  Scenario: TC01 Admin yeni test öğeleri oluşturabilir
    Given SG Admin Medunna url'ine gider
    Then SG Admin Sign In sayfasına gider
    And  SG Admin Kullanıcı bilgileriyle sign in olunur
    Then SG Admin Items&Titles sekmesini tıklar
    And SG Admin açılan menüden Test Item butonunu tıklar
    Then SG Admin açılan sayfadan Create a new Test Item butonunu tıklar
    And  SG Admin Create or edit a Test Item ekranının açıldığını görür
    And SGG Sayfayi kapatir