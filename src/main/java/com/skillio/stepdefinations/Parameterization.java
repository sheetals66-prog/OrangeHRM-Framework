package com.skillio.stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Parameterization {

	int x;
	int y;
	int result;

	@Given("I have numbers 12 and 13")
	public void acceptTwoNumbers(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@When("I add them")
	public void addNumbers() {
		result = x + y;
	}

	@Then("I display result")
	public void displayResult() {
		System.out.println(result);
	}

}
