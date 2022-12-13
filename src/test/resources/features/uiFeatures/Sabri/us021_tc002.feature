Feature: US021 Test items(öğe) Oluştur / Güncelle / Sil
  Scenario: TC02 Staff hasta durumunu (status) "UNAPPROVED, PENDING veya CANCELLED" yapabilmeli ancak "COMPLETED" yapamamalı.
    Given SG Staff Medunna url'ine gider
    Then SG Staff Sign In sayfasına gider
    And  SG Staff Kullanıcı bilgileriyle sign in olunur
    Then SG Staff My Pages sekmesini tıklar
    And SG Staff açılan menüden Search Patient butonunu tıklar
    Then SG Staff açılan sayfadan Patient SSN metin kutusuna hastanın SSN numarasını girer ve enter'a tıklar
    And  SG Staff açılan sayfadan Show Appintments butonunu tıklar
    Then SG Staff açılan sayfadan Edit butonunu tıklar
    And  SG  Staff açılan sayfadan Status kısmını UNAPPROVED, PENDING veya CANCELLED yapabilir ancak COMPLETED yapamaz
    And SG Staff Sayfayi kapatir