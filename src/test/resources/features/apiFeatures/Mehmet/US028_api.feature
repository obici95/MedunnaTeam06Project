Feature:


    Scenario Outline:

    Given kullanici country icin path params olusturur.
    Then kullanici country expected data olusturur, "<country>"
    And kullanici country post request gonderir ve response alir
    And kullanici country response dogrular


    Examples:
      | country  |
      | Turkey02 |