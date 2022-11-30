
  @US0008
  Feature: US0008 Kullanici giris yaptiginda Password sekmesi duzenlenebilir olmalidir
    @US0008_TC001
    Scenario: US0008_TC001 Guclu bir parola icin sifre en az yedi karakterden olusmalidir
      Given Kullanici Medunna urline gider gecerli kullanici bilgileri ile giris yapar
      Then Kullanici ismine tiklanir ardindan password sekmesine tiklanir
      When New Password bolumune en az yedi karakter girilir
      And New Password bolumune en az yedi karakter girildigi dogrulanir

    Scenario: US0008_TC002 Daha guclu bir sifre icin en az bir kucuk harf olmali ve Password strenght seviyesinin degistigi gorulebilmelidir
      Given Kullanici Medunna urline gider gecerli kullanici bilgileri ile giris yapar
      Then Kullanici ismine tiklanir ardindan password sekmesine tiklanir
      When New Password bolumune en az yedi karakter girilir
      And New password bolumune en az bir kucuk harf girilir
      And Password strenght seviyesinin degistigi gorulebilmelidir

    Scenario: US0008_TC003 Sifre en az 1 buyukl harf icermeli ve Password strenght seviyesinin degistigi gorulebilmelidir
      Given Kullanici Medunna urline gider gecerli kullanici bilgileri ile giris yapar
      Then Kullanici ismine tiklanir ardindan password sekmesine tiklanir
      When New Password bolumune en az yedi karakter girilir
      And New password bolumune en az bir kucuk harf girilir
      And New password bolumune en az bir buyuk harf girilir
      And Buyuk harf girildiginde Password strenght seviyesinin degistigi gorulebilmelidir

      #TC4'u yapmaya gerek yok sifre zaten sayi iceriyor

    Scenario: US0008_TC_005 Sifre en az bir ozel karakter icermeli ve Password strenght seviyesinin degistigi gorulebilmelidir
      Given Kullanici Medunna urline gider gecerli kullanici bilgileri ile giris yapar
      Then Kullanici ismine tiklanir ardindan password sekmesine tiklanir
      When New password bolumune en az bir buyuk harf girilir
      And New password bolumune en az bir ozel karakter girilir
      And Ozel karakter girildiginde password strenght seviyesinin degistigi gorulebilmelidir

    Scenario: US0008_TC_006 New password conformation onaylanabilmelidir
      Given Kullanici Medunna urline gider gecerli kullanici bilgileri ile giris yapar
      Then Kullanici ismine tiklanir ardindan password sekmesine tiklanir
      When New password bolumune en az bir ozel karakter girilir
      And New password confirmation bolumune ozel karakterli sifre tekrar yazilir ve onaylandigi dogrulanir

    Scenario: US0008_TC_007 Eski sifre kullanilamamalidir
      Given Kullanici Medunna urline gider gecerli kullanici bilgileri ile giris yapar
      When Kullanici ismine tiklanir ardindan password sekmesine tiklanir
      Then Current password bolumune eski sifre yazilir
      And New Password bolumune eski sifre tekrar yazilir
      And New Password confirmation bolumune eski sifre tekrar yazilir
      And Eski sifrenin kullanilamadigi dogrulanir







