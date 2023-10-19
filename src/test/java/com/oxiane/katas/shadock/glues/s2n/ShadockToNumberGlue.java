package com.oxiane.katas.shadock.glues.s2n;

import com.oxiane.katas.shadock.Shadock;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

public class ShadockToNumberGlue {
  private String inputShadock;
  private int actualNumber;
  private Shadock shadock = new Shadock();

  @Given("Input shadock is {word}}")
  public void input_shadock_is(String inputShadock) {
    this.inputShadock = inputShadock;
  }
  @When("It is converted to number")
  public void it_is_converted_to_number() {
    actualNumber = shadock.toNumber(inputShadock);
  }
  @Then("Number result is {int}")
  public void number_result_is(int expectedNumber) {
    Assertions.assertThat(actualNumber).isEqualTo(expectedNumber);
  }

  @Given("Input shadock is {word}")
  public void inputShadockIs(String inputShadock) {
    this.inputShadock = inputShadock;
  }
}
