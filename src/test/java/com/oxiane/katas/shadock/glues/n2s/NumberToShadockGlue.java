package com.oxiane.katas.shadock.glues.n2s;

import com.oxiane.katas.shadock.Shadock;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

public class NumberToShadockGlue {
  private int inputNumber;
  private String actualShadock;
  private Shadock shadock = new Shadock();

  @Given("Input number is {int}")
  public void input_number_is(int input) {
    this.inputNumber = input;
  }
  @When("It is converted to Shadock")
  public void it_is_converted_to_shadock() {
    actualShadock = shadock.toShadock(inputNumber);
  }
  @Then("Shadock result is {word}")
  public void shadock_result_is(String expected) {
    Assertions.assertThat(actualShadock).isEqualTo(expected);
  }



}
