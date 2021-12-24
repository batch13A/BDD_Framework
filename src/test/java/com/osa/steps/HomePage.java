package com.osa.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage {
	@Given("I open chrome browser")
	public void i_open_chrome_browser() {
	    System.out.println("Printing from first method");
	}

	@And("I nevigate to osa web page")
	public void i_nevigate_to_osa_web_page() {
		System.out.println("Printing from 2nd method");
	}

	@When("I one on home")
	public void i_one_on_home() {
		System.out.println("Printing from 3rd method");
	}

	@Then("I take the home title")
	public void i_take_the_home_title() {
		System.out.println("Printing from 4th method");
	}

	@Then("I verify the title")
	public void i_verify_the_title() {
		System.out.println("Printing from 5th method");
	}

}
