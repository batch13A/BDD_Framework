package com.osa.steps;

import io.cucumber.java.en.Given;

public class Home {
	
	@Given("^I am on osa forum page$")
	public void i_am_on_osa_forum_page(){
		System.out.println("This is from step method");
	}
}
