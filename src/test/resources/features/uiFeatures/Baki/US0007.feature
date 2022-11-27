
  @us7
  Feature: US0007 Hastalar randevu tarihi alabilmelidir
    @us7tc1
   Scenario: US007_TC001 Kullanici gecerli tarih girmelidir.Guncel ya da gelecek tarihi secebilmelidir.
     Given Kullanici Medunna urline gider gecerli kullanici bilgileri ile giris yapar
     Then My Pages menusunden Make an Appointment'a tiklar
     When Appointment Date Time bolumune guncel tarih girilmeli
     And Guncel tarih ile randevu alindigi dogrulanmali
     And Appointmen Date Time bolumune ileri tarih girilmeli
     And Ileri tarih ile randevu alindigi dogrulanmali
     And Sayfayi kapatir

     @us7tc2
   Scenario: US0007_TC02
     Given Kullanici Medunna urline gider gecerli kullanici bilgileri ile giris yapar
     Then My Pages menusunden Make an Appointment'a tiklar
     And Appointmen Date Time bolumunde tarih sirasi gun ay yil ya da ay gun yil seklinde olmalidir
     And Sayfayi kapatir