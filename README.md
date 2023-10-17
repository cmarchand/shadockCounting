# Couting in Shadock

Shadock are french cartoon characters, and they behave strangely...

When they count, starting at 0, they say :
```
GA
BU
ZO
MEU
BUGA
BUBU
BUZO
BUMEU
ZOGA
ZOBU
ZOZO
ZOMEU
MEUGA
MEUBU
MEUZO
MEUMEU
BUGAGA
BUGABU
BUGAZO
BUGAMEU
```

So, there are 4 digits, which are `GA`, `BU`, `ZO` and `MEU`...

You have to implement a converter from arabic numbers to Shadock numbers, and a converter to
shadock numbers to arabic numbers.

I've discovered this kata on [lifelightdev account](https://github.com/lifelightdev/countInShadok/).
My implementation is much more complex than lifelightdev's one, but hers is limited to 16. Mine
uses a Strategy pattern, and unit tests are written in Gherkin with Cucumber.