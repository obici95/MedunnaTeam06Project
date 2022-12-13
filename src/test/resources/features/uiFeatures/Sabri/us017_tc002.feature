Feature: US017 Test items(öğe) Oluştur / Güncelle / Sil
  Scenario: TC02 Test öğeleri oluştururken/güncellerken "Name, Description, price
  Default min value, Default max value and created date as MM/DAY/YEAR öğeleri olmalıdır.
    Given SG Admin Medunna url'ine gider
    Then SG Admin Sign In sayfasına gider
    And  SG Admin Kullanıcı bilgileriyle sign in olunur
    Then SG Admin Items&Titles sekmesini tıklar
    And SG Admin açılan menüden Test Item butonunu tıklar
    Then SG Admin açılan sayfadan Create a new Test Item butonunu tıklar
    And  SG Admin Create or edit a Test Item ekranınında Name, Description, price Default min value, Default max value and created date as Gun Ay Yil öğelerinin olduğunu görür.
    And SGG Sayfayi kapatir