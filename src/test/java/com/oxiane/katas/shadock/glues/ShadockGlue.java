package com.oxiane.katas.shadock.glues;

import com.oxiane.katas.shadock.Shadock;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

public class ShadockGlue {
  private int input;
  private String actual;
  private Shadock shadock = new Shadock();

  @Given("Input number is {int}")
  public void input_number_is(int input) {
    this.input = input;
  }
  @When("It is converted to Shadock")
  public void it_is_converted_to_shadock() {
    actual = shadock.toShadock(input);
  }
  @Then("Shadock result is {word}")
  public void shadock_result_is(String expected) {
    Assertions.assertThat(actual).isEqualTo(expected);
  }

}
