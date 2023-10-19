Feature: Shadock counting

  Scenario Template: Shadock to number
    Given Input shadock is <shadock>
    When It is converted to number
    Then Number result is <number>
    Examples:
      | shadock | number |
      | GA      | 0      |
      | BU      | 1      |
      | ZO      | 2      |
      | MEU     | 3      |
      | BUGA    | 4      |
      | BUBU    | 5      |
      | BUZO    | 6      |
      | BUMEU   | 7      |
      | ZOGA    | 8      |
      | ZOBU    | 9      |
      | ZOZO    | 10     |
      | ZOMEU   | 11     |
      | MEUGA   | 12     |
      | MEUBU   | 13     |
      | MEUZO   | 14     |
      | MEUMEU  | 15     |
      | BUGAGA  | 16     |
      | BUGABU  | 17     |
      | BUGAZO  | 18     |
      | BUGAMEU | 19     |
