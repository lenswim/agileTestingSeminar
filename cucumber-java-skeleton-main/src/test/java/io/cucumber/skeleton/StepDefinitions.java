package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinitions {

    private Belly belly;

    @Given("I have a growling belly")
    public void I_have_a_growling_belly() {
        belly = new Belly(true);
    }

    @When("I eat {int} cookies")
    public void I_eat_cookies(int numberOfCookies) {
        belly.eat(numberOfCookies);
    }

    @Then("my belly should no longer growl")
    public void my_belly_should_no_longer_growl() {
        assertThat(belly.isGrowling()).isFalse();
    }

    @Then("my belly should still growl")
    public void my_belly_should_still_growl() {
        assertThat(belly.isGrowling()).isTrue();
    }
}
