Feature: US021 Test items(öğe) Oluştur / Güncelle / Sil
  Scenario: TC04 Hasta için gerekli doktoru seçebilmeli ve randevuyu oluşturmalı.
    Given SG Staff Medunna url'ine gider ve appointment olusturur
    Then SG Staff Sign In sayfasına gider
    And  SG Staff Kullanıcı bilgileriyle sign in olunur
    Then SG Staff My Pages sekmesini tıklar
    And SG Staff açılan menüden Search Patient butonunu tıklar
    Then SG Staff açılan sayfadan Patient SSN metin kutusuna hastanın SSN numarasını girer ve enter'a tıklar
    And  SG Staff açılan sayfadan Show Appintments butonunu tıklar
    Then SG Staff açılan sayfadan Edit butonunu tıklar
    And  SG Staff açılan sayfada  Physician kısmından ilgili doktoru secip Save butonuna tıklar
    And SG Staff Sayfayi kapatir