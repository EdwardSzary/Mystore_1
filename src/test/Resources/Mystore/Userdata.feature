Feature: Create address on mystore

  Scenario Outline: Test filling in address
    Given User is logged in
    When add address is clicked
    Then fill in credentials with <alias>
    And submit and close the page

    Examples:
      | alias | address  | city     | zip    | country | phone     |
      | RWT   | Lubelska | Warszawa | 01-999 | Poland  | 498100234 |


