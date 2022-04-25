Feature: Return No of vowels and consonant in a string


  Scenario: Return No of vowel and consonant counts when user send the 1 string at a time
    When User send the below strings
      | naga |
    Then user see the number of vowels and consonant for each string

  Scenario: Return No of vowel and consonant counts when user send the 2 string at a time
    When User send the below strings
      | naga |
      |Adhvaith |
    Then user see the number of vowels and consonant for each string

  Scenario: Return No of vowel and consonant counts when user send the 3 strings at a time
   When User send the below strings
    | naga |
    |testautomation |
    |testing |
   Then user see the number of vowels and consonant for each string

  Scenario: Return No of vowel and consonant counts when user send the 4 strings at a time
    When User send the below strings
      | naga |
      |testautomation |
      |testing |
      |Tester  |
    Then user see the number of vowels and consonant for each string


  Scenario: Return No of vowel and consonant counts when user send the 5 string at a time
    When User send the below strings
      | naga |
      |testautomation |
      |testing |
      |Tester  |
      |test    |
    Then user see the message

  Scenario: Return No of vowel and consonant counts when user send the 5 string at a time
    When User send the below strings
      | naga |
      |testautomation |
      |testing |
      |Tester  |
      |test    |
      |check   |
    Then user see the message

