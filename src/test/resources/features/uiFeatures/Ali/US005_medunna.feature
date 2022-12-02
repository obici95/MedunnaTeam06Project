@US_005
Feature: Medunna Search

  Background:
    Given AB Hasta medunna sayfasina gider
    Then AB Hasta Make an Appointment linkine tiklar

  @TC001
  Scenario: TC001 Kullanıcının herhangi bir karakter içeren "First Name" yazması gerekir ve boş bırakılamaz.

    And AB Hasta herhangi bir karakter iceren gecerli bir firstname girer

  @TC002
  Scenario: TC002 Kullanıcı, herhangi bir karakter içeren "Last Name" yazması gerekir, boş bırakılamaz.

    And AB Hasta herhangi bir karakter iceren gecerli bir firstname girer
    And AB Hasta gecerli bir lastname girer

  @TC003
  Scenario: TC003 Kullanıcı SSN numarası girmeli (kayıtlı SSN) boş bırakılamaz.

    And AB Hasta herhangi bir karakter iceren gecerli bir firstname girer
    And AB Hasta gecerli bir lastname girer
    And AB Hasta gecerli ve kayitli olan SSN numarasini girer

  @TC004
  Scenario: TC004 Kullanici gecerli bir email adresi yazmasi gerekir ve bos birakilamaz

    And AB Hasta herhangi bir karakter iceren gecerli bir firstname girer
    And AB Hasta gecerli bir lastname girer
    And AB Hasta gecerli ve kayitli olan SSN numarasini girer
    And AB Hasta  gecerli bir email adresi girer

  @TC005
  Scenario: TC005 Kullanıcı, 3. ve 6. rakamdan sonra "-" olan 10 rakamlı telefon numarasını gireli, boş bırakılamaz.

    And AB Hasta herhangi bir karakter iceren gecerli bir firstname girer
    And AB Hasta gecerli bir lastname girer
    And AB Hasta gecerli ve kayitli olan SSN numarasini girer
    And AB Hasta  gecerli bir email adresi girer
    And AB Hasta gecerli bir telefon numarası girer

  @TC006
  Scenario: TC006 Kullanıcı randevu alıp kaydolduğunda, profillerini görebilir ve uygulamada oturum açabilir.

    And AB Hasta herhangi bir karakter iceren gecerli bir firstname girer
    And AB Hasta gecerli bir lastname girer
    And AB Hasta gecerli ve kayitli olan SSN numarasini girer
    And AB Hasta  gecerli bir email adresi girer
    And AB Hasta gecerli bir telefon numarası girer
    And AB Hasta Send An Appointment Request butonuna tiklar
    And AB Hasta account ve sign in butonuna tiklar
    And AB Hasta gecerli user name girer
    And AB Hasta gecerli password girer
    And AB Hasta sign in butonuna tiklar
    And AB Hasta oturum actigini dogrular
    And AB Hasta mypage butonuna tiklar
    And AB Hasta My Appointment butonuna tiklar
    And AB Hasta aldigi randevulari dogrular














