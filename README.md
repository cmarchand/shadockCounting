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

You have to implement a converter from arabic numbers to Shadock numbers, and a converter from
shadock numbers to arabic numbers.

I've discovered this kata on [lifelightdev account](https://github.com/lifelightdev/countInShadok/).

I've written a first implementation, based on a Strategy pattern, but it's largel overkill.
You can found it in [strategy branch](https://github.com/cmarchand/shadockCounting/tree/strategy).
Unit tests are written in Gherkin with Cucumber.

I've written another implementation, quite simpler, only based on a word array, and it's available in
[master branch](https://github.com/cmarchand/shadockCounting/tree/master).

In the last commit, I've implemented to shadock to number converter. I've been required to separate the two
converters in two different features, because of non-found glues. No idea why... That's not as clear as I expect.

Enjoy !
