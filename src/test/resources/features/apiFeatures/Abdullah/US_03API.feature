  @APITest
  Feature: API Testleri
    Scenario Outline: API kullanarak kayıtlı kişiler oluşturun ve doğrulayın.
      Given Kullanici, "<ssn numarali>" kullanicinin tum bilgilerine GET request gonderir
      Then Kullanici,status kodunun <200> oldugunu dogrular
      And Kullanici,bilgilerin doğruluğunu kontrol eder
      Examples:
        | ssn numarali | 200 |
        | 458-58-2401 | 200 |

