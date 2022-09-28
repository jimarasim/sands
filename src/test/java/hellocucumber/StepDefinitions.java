package hellocucumber;

import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {
    static int card1 = -1;
    static int card2 = -1;
    static int handValue = -1;

    @Given("I have one BlackJack card with the value {string}")
    public void i_have_one_black_jack_card_with_the_value(String card) {
        card1 = valueOfCard(card);
    }

    @Given("another BlackJack card with the value {string}")
    public void another_black_jack_card_with_the_value(String card) {
        card2 = valueOfCard(card);
    }

    @When("I combine the card values")
    public void i_combine_the_card_values() {
        handValue = card1 + card2;
    }

    @Then("then the total value of my hand should be {int}")
    public void then_the_total_value_of_my_hand_should_be(int int1) {
        int expectedHandValue = card1 + card2;
        assertEquals(expectedHandValue, int1, "Incorrect Blackjack Hand value " + int1 + "for one Blackjack card " + card1 + " and another Blackjaeck card " + card2);
    }

    int valueOfCard(String card) {
        int value = -1;
        try {
            value = Integer.parseInt(card);
        } catch (NumberFormatException ex) {
            switch (card) {
                case "J":
                    value = 10;
                    break;
                case "K":
                    value = 10;
                    break;
                case "Q":
                    value = 10;
                    break;
                case "AHIGH":
                    value = 11;
                    break;
                case "ALOW":
                    value = 1;
                    break;
                default:
                    value = -1;
            }
        }
        return value;
    }
}



