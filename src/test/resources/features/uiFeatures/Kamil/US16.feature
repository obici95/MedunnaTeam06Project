@us16
Feature:US_016 Oda Olusturma / Goruntuleme / Guncelleme /Silme

  Background: Admin room ekranini acar
    Given Kullanici "MedunnaUrl" adresine gider
    Then Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    And kullanici acilan dropdown menude signIn butonuna tiklar
    And kullanici username olarak "AdminUserName" girer
    And kullanici password olarak "AdminPassword" girer
    And kullanici Sign In butonuna tiklar
    And Items&Titles elementine tiklar
    And Kullanici acilan dropdown menuden Room sekmesine tiklar

  @sdf
  Scenario:TC_001 Admin yatan hastalar icin yeni oda olusturabilir.
    And Kullanici Create a New Room butonuna tiklar
    And Kullanici Room Number kismina daha once kullanilmamis bir oda numarasi girer
    And Kullanici Price gecerli bir fiyat girer
    And Kullanici Save butonunu tiklar
    And Kullanici cikan mesajinin uzerinde "A new Room is created with identifier"  icerdigini dogrular

  Scenario:TC_002 Oda oluşturulurken "Room Number" mutlaka olmalı, "Room Type"; TWIN, DELUXE, PREMIUM_DELUXE, SUIT ve DAYCARE olmalı
    And Kullanici Create a New Room butonuna tiklar
    Then Kullanici Room Number kismina tiklar
    And Kullanici Price kismina tiklar
    And Kullanici Room Number kisminin altinda "This field is required." yazisinin gorundugunu dogrular
    And Kullanici Room Number kismini harf ve ozel karakter ile doldurur
    And Kullanici Room Number kisminin altinda "This field should be a number." yazisinin gorundugunu dogrular
    And Kullanici Room Type alanindaki secenekler arasinda asagidaki seceneklerin bulundugunu dogrular

  Scenario:TC_003 Oda için "Status" ayarlanabilir olmalı.
    And Kullanici Create a New Room butonuna tiklar
    Then Kullanici Room Number kismina daha once kullanilmamis bir oda numarasi girer
    And Kullanici Status Checkbox'inin Isaretler
    And Kullanici Price gecerli bir fiyat girer
    And Kullanici Save butonunu tiklar
    And Kullanici cikan mesajinin uzerinde "A new Room is created with identifier"  icerdigini dogrular

  Scenario:TC_004 Fiyat eklenebilir olmalı ve bos bırakılamamalı.

    And Kullanici Create a New Room butonuna tiklar
    Then Kullanici Room Number kismina daha once kullanilmamis bir oda numarasi girer
    And Kullanici Price kismina tiklar
    And Kullanici Description kismina aciklama girer
    And Kullanici Price kisminin altinda "This field is required." yazisinin gorundugunu dogrular


  Scenario: TC_005 "Description" isteğe bağlı olarak doldurulmalı.
    And Kullanici Create a New Room butonuna tiklar
    Then Kullanici Room Number kismina daha once kullanilmamis bir oda numarasi girer
    And Kullanici Price gecerli bir fiyat girer
    And Kullanici Description kismina aciklama girer
    And Kullanici Save butonunu tiklar
    And Kullanici cikan mesajinin uzerinde "A new Room is created with identifier"  icerdigini dogrular

  Scenario: TC_006 "Created Date" Gün/Ay/Yıl şeklinde olmalı ve geçmiş tarih seçilememeli.
    And Kullanici Create a New Room butonuna tiklar
    Then Kullanici Room Number kismina daha once kullanilmamis bir oda numarasi girer
    And Kullanici Price gecerli bir fiyat girer
    And Kullanici Create Date alanina gun ay yil girer
    And Kullanici Save butonunu tiklar
    And Kullanici cikan mesajinin uzerinde "A new Room is created with identifier"  icerdigini dogrular

  Scenario: TC_007 Admin aynı tür odaları görebilir.
    Given Kullanici Rooms kismida yer alan Room Type'a tiklar
    Then Kullanici Room Type sutununda "TWIN" tipindeki odalarin gorundugunu dogrular ve ekran resmi alir
    And Kullanici Rooms kismida yer alan Room Type'a tiklar
    And Kullanici Room Type sutununda "DAYCARE" tipindeki odalarin gorundugunu dogrular ve ekran resmi alir

  Scenario: TC_008 Admin mevcut odaları düzenleyebilir ve güncelleyebilir.

    And Kullanici acilan Room sayfasinda edit butonuna tiklar
    And Kullanici Room Number kismina tiklar
    And Kullanici Room Number kismina temizler
    And Kullanici Room Number kismina daha once kullanilmamis bir oda numarasi girer
    And Kullanici Price gecerli bir fiyat girer
    And Kullanici Price kismina tiklar, temizler ve yeni bir price degeri girer
    And Kullanici Save butonunu tiklar
    And Kullanici cikan mesajinin uzerindee "A new Room is updated with identifier"  icerdigini dogrular

  Scenario: TC_009 Odalar Admin tarafından silinebilir.
    Then Kullanici Room Table'da ilk satirda yer alan odanin delete butonuna basar
    And Kullanici Room sayfasinda acilan kisimda delete butonuna tiklar