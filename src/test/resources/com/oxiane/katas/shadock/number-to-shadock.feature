Feature: Shadock counting

  Scenario Template: Number to shadock
    Given Input number is <number>
    When It is converted to Shadock
    Then Shadock result is <shadock>
    Examples:
      | number | shadock |
      | 0      | GA      |
      | 1      | BU      |
      | 2      | ZO      |
      | 3      | MEU     |
      | 4      | BUGA    |
      | 5      | BUBU    |
      | 6      | BUZO    |
      | 7      | BUMEU   |
      | 8      | ZOGA    |
      | 9      | ZOBU    |
      | 10     | ZOZO    |
      | 11     | ZOMEU   |
      | 12     | MEUGA   |
      | 13     | MEUBU   |
      | 14     | MEUZO   |
      | 15     | MEUMEU  |
      | 16     | BUGAGA  |
      | 17     | BUGABU  |
      | 18     | BUGAZO  |
      | 19     | BUGAMEU |