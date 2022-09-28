package hellocucumber;

import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {
    static int card1 = 0;
    static int card2 = 0;
    static int handValue = 0;
    @Given("I have one BlackJack card with the value {int}")
    public void i_have_one_black_jack_card_with_the_value(Integer int1) {
        card1 = int1;
    }
    @Given("another BlackJack card with the value {int}")
    public void another_black_jack_card_with_the_value(Integer int1) {
        card2 = int1;
    }
    @When("I combine the card values")
    public void i_combine_the_card_values() {
        handValue = card1 + card2;
    }
    @Then("then the total value of my hand should be {int}")
    public void then_the_total_value_of_my_hand_should_be(Integer int1) {
        int expectedHandValue = card1 + card2;
        assertEquals(expectedHandValue, int1, "Incorrect Blackjack Hand value " + int1 + "for one Blackjack card " + card1 + " and another Blackjaeck card " + card2);
    }

}
