Feature: Sands Black Jack Sample - by James Arasim

  Scenario Outline: the blackjack value of two numbered cards combine
    Given I have one BlackJack card with the value <card1>
      And another BlackJack card with the value <card2>
    When I combine the card values
    Then then the total value of my hand should be <value.of.card1.and.card2>
    Examples:
      | card1 | card2 | value.of.card1.and.card2 |
      |   "1" |     "1" |                      2 |
      |   "1" |     "10" |                    11 |
      |   "Q" |     "AHIGH" |                 21 |
      |   "J" |     "AHIGH" |                 21 |
      |   "J" |     "ALOW" |                  11 |
      |   "K" |     "AHIGH" |                 21 |
      |   "AHIGH" |     "AHIGH" |             22 |
      |   "ALOW" |     "ALOW" |                2 |
      |   "ALOW" |     "AHIGH" |              12 |

