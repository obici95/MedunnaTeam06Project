@US03
Feature: US_003 Registration sayfasında güçlü şifre girilmeli ve "Password strength" seviyeleri görülebilmelidir.

  Background:TestCase Ortak adımlar
    Given AA Kullanici, "medunnaURL" ana sayfasinda aa
    Then AA Kullanici, sag tarafta bulunan ikona tiklar aa
    And AA Kullanici, ikonun altinda acilan Register butonuna tiklar aa

  @US03TC01
  Scenario Outline: TC_001 Geçerli bir parola en az 4 karakter olmalıdır.
    And AA Kullanici, New password bolumune dort karakterlik bir "<sifre>" girer
    And AA Kullanici, New password confirmation bolumune ayni "<sifre>" yi girer
    And AA Kullanici, Your password is required to be at least four characters. yazisinin kalktigini dogrular.
    Examples:
      | sifre |
      | aA1.  |
      | aaaa  |
      | 1234  |
      | AAAA  |

  @US03TC04
  Scenario Outline: TC_002 Geçerli bir parola en az 4 karakter olmalıdır.
    And AA Kullanici, New password bolumune dort karakterden az bir "<sifre>" girer
    And AA Kullanici, New password confirmation bolumune ayni "<sifre>" yi girer
    And AA Kullanici Your password is required to be at least four characters. yazisinin oldugunu dogrular.
    Examples:
      | sifre |
      | aA.   |
      | a1.   |
      | A1.   |
      | aA1   |

  @US03TC03
  Scenario Outline: TC_003 Güçlü bir parola için şifre en az 7 karakterden oluşmalıdır.
    And AA Kullanici, New Password bolumune en az yedi karakterden olusan bir "<sifre>" girer
    And AA Kullanici, New password confirmation bolumune ayni "<sifre>" yi girer
    And AA Kullanici, Password Strength seviyesinin <2> oldugunu dogrular.
    Examples:
      | sifre   | 2 |
      | aaaaaaA | 2 |
      | @@@@@@@@@@ | 3 |
      | 12345Aa | 4 |
      | aA1.asd | 5 |

  @US03TC04
  Scenario Outline: TC_003 Güçlü bir parola için şifre en az 7 karakterden oluşmalıdır.
    And AA Kullanici, New Password bolumune en az yedi karakterden olusan bir "<sifre>" girer
    And AA Kullanici, New password confirmation bolumune ayni "<sifre>" yi girer
    And AA Kullanici, Password Strength seviyesinin <2> oldugunu dogrular.
    Examples:
      | sifre   | 2 |
      | aaaaaaA | 2 |
      | @@@@@@@@@@ | 3 |
      | 12345Aa | 4 |
      | aA1.asd | 5 |

  @US30TC05
  Scenario Outline: TC_004 Daha güçlü şifre için en az 1 küçük harf olmalı ve "Password strength" seviyesinin değiştiği görülebilmelidir.

    And AA Kullanici, New Password bolumune en az alti karakterlik bir "<sifre>" girer
    And AA Kullanici, New Password bolumune en az bir tane "<kucukHarf>" ekler.
    And AA Kullanici, New password confirmation bolumune ayni "<sifre1>" yi girer
    And AA Kullanıcı, Password Strength seviyesinin degistigini dogrular.
    Examples:
      | sifre | harf | sifre1 |
      | 123456 | a | 123456a |
      | 12345A | a | 12345Aa |
      | 1bA.c? | a | 1bA.c?a |

  @US30TC06
  Scenario Outline: TC_005 Şifre en az 1 rakam içermeli ve "Password strength" seviyesinin değiştiği görülebilmelidir.

    And AA Kullanici, New Password bolumune en az alti karakterlik bir "<sifre>" girer
    And AA Kullanici, New Password bolumune en az bir tane "<buyukHarf>" ekler.
    And AA Kullanici, New password confirmation bolumune ayni "<sifre1>" yi girer
    And AA Kullanıcı, Password Strength seviyesinin degistigini dogrular.
    Examples:
      | sifre | buyukHarf | sifre1 |
      |aaaaaa  | B | aaaaaaB |
      | .?!>;d | C | .?!>;dC |
      |0'U+iş  | Ğ | 0'U+işĞ |

  @US03TC07
  Scenario Outline: TC_006 Şifre en az 1 rakam içermeli ve "Password strength" seviyesinin değiştiği görülebilmelidir.

    And AA Kullanici, New Password bolumune en az alti karakterlik bir "<sifre>" girer
    And AA Kullanici, New Password bolumune en az bir tane "<rakam>" ekler.
    And AA Kullanici, New password confirmation bolumune ayni "<sifre1>" yi girer
    And AA Kullanıcı, Password Strength seviyesinin degistigini dogrular.
    Examples:
      | sifre | rakam | sifre1 |
      |%&/()@  | 8 | %&/()@8 |
      | QWERty | 7 | QWERty7 |
      |₺*54mN  | 6 | ₺*54mN6 |

  @US03TC08
  Scenario Outline: TC_007 Şifre en az 1 özel karakter içermeli ve"Password strength" seviyesinin değiştiği görülebilmelidir.

    And AA Kullanici, New Password bolumune en az alti karakterlik bir "<sifre>" girer
    And AA Kullanici, New Password bolumune en az bir tane "<ozelKarakter>" ekler.
    And AA Kullanici, New password confirmation bolumune ayni "<sifre1>" yi girer
    And AA Kullanıcı, Password Strength seviyesinin degistigini dogrular.
    Examples:
      | sifre | ozelKarakter | sifre1 |
      |%&/()@  | 8 | %&/()@8 |
      | QWERty | 7 | QWERty7 |
      |₺*54mN  | 6 | ₺*54mN6 |


