package com.osa.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.osa.base.Browser;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Home {
	WebDriver dr;
	@Given("^I am on osa forum page$")
	public void i_am_on_osa_forum_page(){
		dr=Browser.openBrowser("chrome");
		dr.get("https://www.osaconsultingtech.com");
		dr.findElement(By.xpath("//a[text()='Forum']")).click();
	}
	@And("^I enter valid username \"([^\"]*)\"$")
	public void i_enter_valid_usernamee(String username){
		dr.findElement(By.id("username")).sendKeys(username);
	}
	@And("^I enter valid password \"([^\"]*)\"$")
	public void i_enter_valid_password(String password){
		dr.findElement(By.name("password")).sendKeys(password);
	}
	@When("^I click on login button$")
	public void i_click_on_login_button(){
		dr.findElement(By.xpath("//button[@id='login_button']")).click();
	}
	@Then("^I verify that I am able to loggin$")
	public void i_verify_that_I_am_able_to_loggin(){
		String expTitle="Student Page";
		String actualTitle=dr.getTitle();
		if(expTitle.contains(actualTitle)) {
			System.out.println("The test is passed");
		}else {
			System.out.println("The test is failed!!!!!!!!!!!!!");
			System.out.println("Expected Result: "+expTitle);
			System.out.println("Actual Result: "+actualTitle);
		}
	}
	@And("^I close the browser$")
	public void i_close_the_browser(){
		dr.close();
	}
}
