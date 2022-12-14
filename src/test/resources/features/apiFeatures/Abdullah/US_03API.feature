  @APITest
  Feature: API Testleri
    Scenario Outline: API kullanarak kayıtlı kişiler oluşturun ve doğrulayın.
      Given Kullanici, "<ssn numarali>" kullanicinin tum bilgilerine GET request gonderir apı
      Then Kullanici,status kodunun <200> oldugunu dogrular aa
      And Kullanici,bilgilerin doğruluğunu API kullanarak kontrol eder aa
      Examples:
        | ssn numarali | 200 |
        | 458-58-2401 | 200 |

